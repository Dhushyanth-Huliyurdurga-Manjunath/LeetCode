package General;

class Solution4 {
    public int romanToInt(String s) {
        int value = 0;

        for(int i = 0; i < s.length(); i++){
            switch(s.charAt(i)){
                case 'I': 

                        try{
                            if(s.charAt(i+1) == 'V'){
                                value += 4;
                                i++;
                            }
                            else if(s.charAt(i+1) == 'X'){
                                value += 9;
                                i++;
                            }
                            else{
                                value += 1;
                            }
                        }
                        catch(Exception e){
                            value += 1;
                        }
                        //    if(s.charAt(i+1) != 'V')
                        //     value += 1;
                        //    else{
                        //        value += 4; 
                        //        i++;
                        //    }
                           break;
                case 'V' : value += 5;
                            break;
                case 'X' : 
                            try{
                                if(s.charAt(i+1) == 'C'){
                                     value += 90;
                                     i++;
                                }
                                else if(s.charAt(i+1) == 'L'){
                                    value += 40; 
                                    i++;
                                }
                                else{
                                    value += 10;
                                }
                            }
                            catch(Exception e){
                                value += 10;
                            }
                            break;
                case 'L' : value += 50; 
                            break;
                case 'C' :
                            try{
                                if(s.charAt(i+1) == 'M'){
                                     value += 900;
                                     i++;
                                }   
                                else if(s.charAt(i+1) == 'D'){
                                    value += 400;
                                    i++;
                                }
                                else{
                                    value += 100; 
                                }
                            }
                            catch(Exception e){
                                value += 100;
                            }
                            break;
                case 'D' : value += 500; 
                            break; 
                case 'M' : value += 1000;
                            break;
            }
        }

        return value;
    }
}