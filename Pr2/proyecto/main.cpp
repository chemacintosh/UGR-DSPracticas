#include "Equipo.cpp"
#include "Cliente.cpp"

using namespace std;

int main()
{
    Cliente client;
    Equipo eq1(Tarjeta(40.50, "RTX 2060"), Disco(100.65, "Seagate Barracuda"), Bus(49.90, "SuperBus"));

    client.crearEquipo(eq1);

    client.ejecutar();
}