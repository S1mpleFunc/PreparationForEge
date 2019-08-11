{ https://inf-ege.sdamgia.ru/problem?id=9317 }

const
    N = 2000;
var
    a: array [1..N] of integer;
    i, k: integer;
begin
    for i := 1 to N do begin
        readln(a[i]);
        k := k + a[i];
    end;
    if k mod 2 = 0 then begin
        k := 0;
        for i := 1 to N do
            if a[i] mod 2 <> 0 then
                inc(k);
    end else begin 
        k := 0;
        for i := 1 to N do
            if a[i] mod 2 = 0 then
                inc(k);
    end;
    writeln(k);
end.