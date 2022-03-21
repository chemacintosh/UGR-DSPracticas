#include <iostream>
#include "Tarjeta.cpp"
#include "Bus.cpp"
#include "Disco.cpp"
#include "VisitantePrecio.cpp"
#include <string>

using namespace std;

class Equipo
{
private:
    Tarjeta t;
    Disco d;
    Bus b;

    string precioTotal;
    string factura;

public:
    Equipo(Tarjeta c1, Disco c2, Bus c3)
    {
        t = c1;
        d = c2;
        b = c3;
    }

    string getPrecioTotal()
    {
        return precioTotal;
    }

    string getFactura()
    {
        return factura;
    }

    void Aceptar(VisitantePrecio visit)
    {
        visit.Visitar(t);
        visit.Visitar(d);
        visit.Visitar(b);

        precioTotal = visit.toString();
    }
};

int main()
{
    Cliente client;
    Equipo eq1(Tarjeta(40.50, "RTX 2060"), Disco(100.65, "Seagate Barracuda"), Bus(49.90, "SuperBus"));

    client.crearEquipo(eq1);

    client.ejecutar();
}