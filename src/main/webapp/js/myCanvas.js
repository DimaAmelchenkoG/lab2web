// //<script>
//     var example = document.getElementById("example"),
//     ctx     = example.getContext('2d');
//     example.height = 480;
//     example.width  = 640;
var canv = document.getElementById('canvas'),
    ctx = canv.getContext('2d');
// ctx.strokeStyle = '#B70A02'; // меняем цвет рамки
// ctx.strokeRect(15, 15, 266, 266);
// ctx.strokeRect(18, 18, 260, 260);
// ctx.fillStyle = '#AF5200'; // меняем цвет клеток

ctx.beginPath();
ctx.moveTo(0, 500);
ctx.lineTo(0, 0);
ctx.lineTo(500, 0);
ctx.lineTo(500, 500);
ctx.lineTo(0, 500);
ctx.stroke();

ctx.beginPath();
ctx.moveTo(270, 100);
ctx.lineTo(230, 100);
ctx.stroke();

ctx.beginPath();
ctx.moveTo(0, 250);
ctx.lineTo(500, 250);
ctx.lineTo(0, 250);
ctx.stroke();

ctx.beginPath();
ctx.moveTo(250, 0);
ctx.lineTo(250, 500);
ctx.lineTo(250, 0);
ctx.stroke();

ctx.fillStyle = '#FF0000';
ctx.beginPath();
ctx.moveTo(250, 250);
ctx.lineTo(250, 400);
ctx.lineTo(400, 250);
ctx.lineTo(250, 250);
ctx.fill();
ctx.stroke();

ctx.beginPath();
ctx.moveTo(250, 250);
ctx.lineTo(250, 100);
ctx.lineTo(400, 100);
ctx.lineTo(400, 250);
ctx.lineTo(250, 250);
ctx.fill();
ctx.stroke();

ctx.beginPath();
ctx.moveTo(250,250);
ctx.arc(250,250,75, -Math.PI/2, Math.PI,true);
ctx.fill();
ctx.stroke();

ctx.beginPath();
ctx.moveTo(270, 175);
ctx.lineTo(230, 175);
ctx.stroke();

ctx.beginPath();
ctx.moveTo(270, 325);
ctx.lineTo(230, 325);
ctx.stroke();

ctx.beginPath();
ctx.moveTo(270, 400);
ctx.lineTo(230, 400);
ctx.stroke();

ctx.beginPath();
ctx.moveTo(400, 270);
ctx.lineTo(400, 230);
ctx.stroke();

ctx.beginPath();
ctx.moveTo(325, 270);
ctx.lineTo(325, 230);
ctx.stroke();

ctx.beginPath();
ctx.moveTo(100, 270);
ctx.lineTo(100, 230);
ctx.stroke();

ctx.beginPath();
ctx.moveTo(175, 270);
ctx.lineTo(175, 230);
ctx.stroke();




// ctx.fillRect(20, 20, 256, 256);
// for (i = 0; i < 8; i += 2)
// for (j = 0; j < 8; j += 2) {
// ctx.clearRect(20 + i * 32, 20 + j * 32, 32, 32);
// ctx.clearRect(20 + (i + 1) * 32, 20 + (j + 1) * 32, 32, 32);
//}
//</script>
