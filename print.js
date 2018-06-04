/**
 * 按照10个一行的格式打印
 */
function print10PerLine(param) {
    count ++;
    print(param + " ");
    if (count % 10 == 0) {
        print("<br>");
    }
}

/**
 * 打印参数param
 */
function print(param) {
    document.write(param);
}

