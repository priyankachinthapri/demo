<script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>


<script>
function theFunction(type){

if(type=="addBook"){

$("#frame2").show();
$("#frame3").hide();
$("#frame4").hide();
$("#frame5").hide();
}else if(type=="addStudent"){
$("#frame3").show();
$("#frame2").hide();
$("#frame4").hide();
$("#frame5").hide();
} else if(type=="viewStudents"){
$("#frame4").show();
$("#frame3").hide();
$("#frame2").hide();
$("#frame5").hide();
}else if(type=="viewBooks"){
$("#frame5").show();
$("#frame3").hide();
$("#frame4").hide();
$("#frame2").hide();
}

}
</script>
<html>
   
   <head>
      <title>HTML Frames</title>
   </head>
   

   
  
  <table style="width: 100%; height: 100%" cols="2">
<tr>
<td><body bgcolor="pink">


   <h3>Click the following links:</h3>
<a href="#" onclick="return theFunction('addBook');"> Add  Book to Library</a><br>
<a href="#" onclick="return theFunction('viewBooks');"> View Available Books</a><br>
<a href="#" onclick="return theFunction('addStudent');"> Add Student</a><br>
<a href="#" onclick="return theFunction('viewStudents');"> View Students and Book Info</a><br>
</body></td>
<td><iframe id="frame2" src="/addBook" style="margin: 0; width: 100%;  height: 100% ;display:none"></iframe></td>

<td><iframe id="frame3" src="/addStudent" style="margin: 0; width: 100%;  height: 100%;display:none"></iframe></td>
<td><iframe id="frame4" src="/viewStudents" style="margin: 0; width: 100%;  height: 100%;display:none"></iframe></td>
<td><iframe id="frame5" src="/viewBooks" style="margin: 0; width: 100%;  height: 100%;display:none"></iframe></td>
</tr>
</table>


      
      
   
</html>