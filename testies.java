class numtoword{
    private String ones(int num){
        String word="";
        switch(num){
            case 1: word=" one";break;
            case 2: word=" two";break;
            case 3: word=" three";break;
            case 4: word=" four";break;
            case 5: word=" five";break;
            case 6: word=" six";break;
            case 7: word=" seven";break;
            case 8: word=" eight";break;
            case 9: word=" nine";break;
            case 10: word=" ten";break;
            case 11: word=" eleven";break;
            case 12: word=" twelve";break;
            case 13: word=" thirteen";break;
            case 14: word=" fourteen";break;
            case 15: word=" fifteen";break;
            case 16: word=" sixteen";break;
            case 17: word=" seventeen";break;
            case 18: word=" eighteen";break;
            case 19: word=" nineteen";break;
        }
    return word;
    }

    private String ty(int num){
        String word="";
        switch(num){
            case 20: word="twenty ";break;
            case 30: word="thirty ";break;
            case 40: word="forty ";break;
            case 50: word="fifty ";break;
            case 60: word="sixty ";break;
            case 70: word="seventy ";break;
            case 80: word="eighty ";break;
            case 90: word="ninety ";break;
        }
    return word;
    }

    public void convert(int num){
        String answer="";
        if (num>=1000 && num<=9999){
            answer=ones(num/1000)+" thousand";
            num=num%1000;
        }
        if (num>=100){
            answer+=ones(num/100)+" hundred ";
            num=num%100;
        }
        if (num>=20){
            answer+="and "+ty(num/10*10);
            num=num%10;

        }
        if (num>=1 && num<=19){
            answer+=ones(num)+"";
        }
        System.out.println(answer);
    }
}


class testies{
    public static void main(String xyz[]){
        numtoword c=new numtoword();
        c.convert(3625);
        
    }
}


    
       
        

    


