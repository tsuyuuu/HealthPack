var x = document.getElementById("index").getElementsByTagName("ol")[0].getElementsByTagName("li");

for (var i = 0; i < x.length; i++){
    window.open(x[i].getElementsByTagName("a")[0].href);
    for (var j = 0; j < 999999; j++);
}
console.log("yum");