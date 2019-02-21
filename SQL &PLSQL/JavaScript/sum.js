<html>
	<head>
		<script>
			function mysum(){
			var a=document.getElementById("x").value;
			var z=document.getElementById("y").value;
			var x=a + z;
			document.getElementById("answer").innerHTML=(a+z);
			}
		</script>
	</head>
	<body>
		Enter First Number  : <input type="text" name="number" id="x" value="1"><br>
		Enter Second Number : <input type="text" name="number" id="y" value="2"><br>
		<button onclick="mysum()">ADD</button>
		<p id="answer"></p>
	</body>
</html>