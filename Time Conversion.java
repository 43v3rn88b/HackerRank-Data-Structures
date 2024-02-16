public static String timeConversion(String s) {
        //extract components
        int hours = Integer.parseInt(s.substring(0, 2));
        int minutes = Integer.parseInt(s.substring(3, 5));
        int seconds = Integer.parseInt(s.substring(6, 8));
        String am_pm = s.substring(8);
        
        //convert
        if(am_pm.equals("PM") && hours != 12 ){
            hours += 12;
        }else if(am_pm.equals("AM") && hours == 12){
            hours = 0;
        }
        
        //format result
        return String.format("%02d:%02d:%02d", hours, minutes, seconds);

    }
