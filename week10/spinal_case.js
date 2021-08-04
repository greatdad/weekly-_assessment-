function spinalCase(str) {   
   //algorithm of spinal case
   str = "Demonstration of a string in spinal case";
   return str.split(/\s|_|(?=[A-Z])/).join("-").toLowerCase(); 
   console.log(str);
}
