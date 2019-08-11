{ https://inf-ege.sdamgia.ru/problem?id=7386 }

const
    N = 30;
var
    a: array [1..N] of integer;
    i, j, max: integer;
begin
    for i := 1 to N do 
        readln(a[i]);
    max := 149;
    for i := 1 to N do 
        if (a[i] > max) and (a[i] < 175) then
            max := a[i];
    writeln(max);
end.