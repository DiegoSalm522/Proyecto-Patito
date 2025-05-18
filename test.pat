program test;
var a, b : int;
// Función con parámetros válidos
void saludar(numero : int) :
{
    print("Hola usuario");
    print(numero);
}
// Función con suma
void sumar(x : int, y : int) :
var resultado : int;
{
    resultado = x + y;
    print(resultado);
}
main {
    a = 10;
    b = 20;
    sumar(a, b);          // OK
    saludar(42);          // OK
    a = b + 2.5;          // Error: float -> int
    sumar(a);             // Error: argumentos insuficientes
    llamar();             // Error: función no declarada
}
end
