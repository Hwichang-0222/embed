let cat = document.querySelector("#cat");

cat.addEventListener("mouseover",() => {
	cat.src = "images/kitty-2.png"
});
cat.addEventListener("mouseout",() => {
	cat.src = "images/kitty-1.png"
});

let cat1 = document.querySelector(".cat");

cat1.addEventListener("mouseover", () => {
	cat1.style.backgroundColor = "black";
	cat1.style.borderRadius = "50%";
});

cat1.addEventListener("mouseout", () => {
	cat1.style.backgroundColor = "";
	cat1.style.borderRadius = "";
});
