
document.addEventListener("DOMContentLoaded",function() {
	let check = document.querySelectorAll(".check");
	for (let i = 0; i < check.length; i++){
		check[i].addEventListener("click", function(event) {
			this.style.textDecoration = "line-through"
			this.parentNode.style.color = "#ccc";
			this.parentNode.style.textDecoration="line-through";
		});
	}
});
