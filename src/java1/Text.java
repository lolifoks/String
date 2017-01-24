/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java1;

/**
 *
 * @author azrap
 */
public class Text {
    
    private String s;
    
    public Text(){
    
        this.s = "";
    }
    
    public Text(String s){
    
        this.s = s;
    }

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }
    
    public void Equals(String string){
    
        if(this.s.equals(string)){
        System.out.println("Strings are equal");
        }
        else System.out.println("Strings are not equal");
    }
    
    public void Add(String add){
    
        this.s+=add;
        System.out.println(s);
    }
    
    public int CountDots(){
    
        int c = 0;
        
        for(int i = 0; i<s.length(); i++){
        
        if(s.charAt(i)=='.') c++;
        
        
        }
    return c;}
    
    public String TrimSpaces(){
    
        String temp = s.trim();
        while(temp.contains("  ")) {temp=temp.replace("  ", " ");}
        
        temp = temp.replace(" .", ". ");
        temp = temp.replace(" ?", "? ");
        temp = temp.replace(" !", "! ");
        
        
        
        return temp;
    
    }
    
    public int CountWords(){
    
        return this.TrimSpaces().split(" ").length;
    }
    
    public String[] Words(){
    
        String temp = this.TrimSpaces();
        temp = temp.replace("!", "");
        temp = temp.replace("?", "");
        temp = temp.replace(".", "");
        temp = temp.replace(",", "");
        
        return temp.split(" ");
    }
    
    public String CapitalLeters(){
    
        String temp = "";
        boolean CapLet = true;
        char c;
        String s = this.TrimSpaces();
        for(int i = 0; i<s.length(); i++){
        c = s.charAt(i);
        if(Character.isAlphabetic(c) && CapLet){
            
            temp+=Character.toUpperCase(c);
            CapLet=false;
        }
        else if(Character.isUpperCase(c) && !CapLet){
        
            temp+=Character.toLowerCase(c);
            
            
        }
        
        else {
            temp+=c;
            
        }
        
        if(c=='!' || c=='?' || c=='.'){
        
            CapLet = true;
        }
        }
        
        return temp;
    
    }
    }

