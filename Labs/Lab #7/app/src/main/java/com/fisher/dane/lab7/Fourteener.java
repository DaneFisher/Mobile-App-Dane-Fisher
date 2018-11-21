package com.fisher.dane.lab7;

public class Fourteener {
    private String fourteener;
    private String fourteenerURL;

    private void setCoffeeInfo(Integer coffeeCrowd){
        switch (coffeeCrowd){
            case 0: //Easy
                fourteener="Handies";
                fourteenerURL="https://www.14ers.com/route.php?route=hand1&peak=Handies+Peak";
                break;
            case 1: //Long
                fourteener="Snowmass";
                fourteenerURL="https://www.14ers.com/route.php?route=snow1&peak=Snowmass+Mountain";
                break;
            case 2: //Exposed
                fourteener="Capitol";
                fourteenerURL="https://www.14ers.com/route.php?route=capi1&peak=Capitol+Peak";
                break;
            case 3: //Technical
                fourteener="Maroon Bells Traverse";
                fourteenerURL="https://www.14ers.com/route.php?route=nmar4&peak=Maroon+Bells+and+Pyramid+Peak";
                break;
            case 4: //Close
                fourteener="Longs";
                fourteenerURL="https://www.14ers.com/route.php?route=long1&peak=Longs+Peak";
                break;
            default:
                fourteener="Longs";
                fourteenerURL="https://www.14ers.com/route.php?route=long1&peak=Longs+Peak";
        }
    }

    public void setFourteener(Integer coffeeCrowd){

        setCoffeeInfo(coffeeCrowd);
    }

    public void setFourteenerURL(Integer coffeeCrowd){

        setCoffeeInfo(coffeeCrowd);
    }

    public String getFourteener(){

        return fourteener;
    }

    public String getFourteenerURL(){

        return fourteenerURL;
    }
}