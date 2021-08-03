function diffArrays (array1, array2) {
   var first = [];
   var different = [];
   for (var i = 0; i <array1.length; i++) {
        first[array1[i]] = true;
}
for  (var i = 0; i <array2.lenth; i++){
      if (first[array2[i]]){
          delete first[array2[i]];
    }else{
       first[array2[i]] = true;
    }
}
for (var k in first) {
    different.push(k);
    }
  return different;
}
console.log(diffArrays['gift','dirt','pink wool','dead shrub'],['gift','dirt','dead shrub']));
