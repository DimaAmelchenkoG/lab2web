var table = document.getElementById('mytable');
ctx.fillStyle = '#0000FF';

for (var z = 1, n = table.rows.length; z < n; z++) {
   // for (var c = 1, m = 4; c < m; c++) {
        //alert(table.rows[r].cells[c].innerHTML);
        var x = (table.rows[z].cells[1].innerHTML);
        var y = (table.rows[z].cells[2].innerHTML);
        var r = (table.rows[z].cells[3].innerHTML);
 //   }
        ctx.fillRect((250 + 150 * x/r),(250 - 150 * y/r),5,5);
}