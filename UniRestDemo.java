package edu.studio.issue;

import kong.unirest.Unirest;

public class UniRestDemo {
    
    public static void main(String[] args) {
        
        String responseBody = 
                Unirest.get("https://api.github.com/repos/CSC5930-003-Studio-Spring2020/githubissues-ms-O/issues")
               .basicAuth(args[0], args[1])
               .asString()
               .getBody();
        
        System.out.println(responseBody);
    }

}
