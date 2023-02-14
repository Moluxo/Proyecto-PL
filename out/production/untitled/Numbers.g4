grammar Numbers;



r : ( SALTO|USER | LINK | HASHTAG | OTRO| OTROS | SPACE| FINISH|ROJO)+;

S: [\t\r] -> skip;




SALTO: [\n\r]{
    Contador.cont++;
    System.out.println();};
OTRO: {Contador.flag}?[A-Za-z]+{
   Contador.cont+=getText().length();
   if(Contador.cont <140){
           System.out.print(getText());
       }else{//significa que se ha pasado de caracteres
           Contador.num=Contador.cont-140;
           Contador.num2=getText().length()-Contador.num;
           Contador.s1=getText().substring(0,Contador.num2);
           Contador.s2=getText().substring(Contador.num2);

           System.out.print(Contador.s1+
           "<SPAN CLASS=\"sobrante\">"+Contador.s2);

           Contador.flag=false;



           //calcuclo de diferencia
   }


};

SPACE:{Contador.flag}?' '{
Contador.cont+=getText().length();
System.out.print(' ');};

OTROS:{Contador.flag}?[.,]{

    Contador.cont+=getText().length();
    System.out.print(getText());
};

USER: {Contador.flag}?'@'[a-zA-Z0-9]+{
    Contador.cont+=getText().length();
    if(Contador.cont <140){
        System.out.print("<SPAN CLASS=\"usr\">"+getText()+"</SPAN>");
    }else{//significa que se ha pasado de caracteres
        Contador.num=Contador.cont-140;
        Contador.num2=getText().length()-Contador.num;
        Contador.s1=getText().substring(0,Contador.num2);
        Contador.s2=getText().substring(Contador.num2);

        System.out.print("<SPAN CLASS=\"usr\">"+Contador.s1+"</SPAN>"+
        "<SPAN CLASS=\"sobrante\">"+Contador.s2);

        Contador.flag=false;



        //calcuclo de diferencia
    }

};

LINK: {Contador.flag}?'http://www.'[a-zA-Z0-9]+'.'[a-z]+{
    Contador.cont+=getText().length();

    if(Contador.cont <140){
            System.out.print("<SPAN CLASS=\"link\">"+getText()+"</SPAN>");
        }else{//significa que se ha pasado de caracteres
            Contador.num=Contador.cont-140;
            Contador.num2=getText().length()-Contador.num;
            Contador.s1=getText().substring(0,Contador.num2);
            Contador.s2=getText().substring(Contador.num2);
            System.out.print("<SPAN CLASS=\"link\">"+Contador.s1+"</SPAN>"+
            "<SPAN CLASS=\"sobrante\">"+Contador.s2);

            Contador.flag=false;



            //calcuclo de diferencia
        }

};

HASHTAG: {Contador.flag}?'#'[a-zA-Z0-9]+{
    Contador.cont+=getText().length();

    if(Contador.cont <140){
        System.out.print("<SPAN CLASS=\"hashtag\">"+getText()+"</SPAN>");
    }else{//significa que se ha pasado de caracteres
        Contador.num=Contador.cont-140;
        Contador.num2=getText().length()-Contador.num;
        Contador.s1=getText().substring(0,Contador.num2);
        Contador.s2=getText().substring(Contador.num2);

        System.out.print("<SPAN CLASS=\"hashtag\">"+Contador.s1+"</SPAN>"+
        "<SPAN CLASS=\"sobrante\">"+Contador.s2);

        Contador.flag=false;



        //calcuclo de diferencia
    }

};

FINISH: '#FIN@'{System.out.print("\n</p> </body> </html>");};

ROJO:{!Contador.flag}?.+[\n\r][\n\r]{
    Contador.extra=getText();
    System.out.print(Contador.extra + "</SPAN>");
};

//SOBRANTE: ;

//El RESTO YA OCUPA LOS SALTOS DE LÍNEA
//[a-zA-Z0-9\s]
//calse lexer --> sentencias en el constructor del lexer
//otra forma --> cuando se va a ejecutar antlr --> llamar al sntactico