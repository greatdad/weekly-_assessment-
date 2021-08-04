function spinalCase(str) {   
   //algorithm of spinal case
   return str.split(/\s|_|(?=[A-Z])/).join("-").toLowerCase(); 
}
   spinalCase("Demonstration of a string in spinal case");
