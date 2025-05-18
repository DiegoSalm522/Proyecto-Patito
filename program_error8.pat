program test;
void definir() :
var a : int;
{
    a = 10;
}
main {
    print(a);        // 'a' es local a 'definir', no visible aquí
}
end
