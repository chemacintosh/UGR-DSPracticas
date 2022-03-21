#include <iostream>
#include "ComponenteEquipo.cpp"
#include "vector"

using namespace std;

class VisitantePrecio
{
private:
    int clasificacion;
    double total;

public:
    void Visitar(ComponenteEquipo elemento)
    {
        total += elemento.costo;
    }

    void Visitar(Disco disco)
    {
        total += disco.getCosto();
    }

    void Visitar(Equipo eq)
    {
        eq.Aceptar(*this);
    }

    void Visitar(Tarjeta tarje)
    {
        total += tarje.getCosto();
    }

    void Visitar(Bus bus)
    {
        total += bus.getCosto();
    }

    string toString()
    {
        string aDevolver;
        aDevolver.append("El valor total del Equipo: ");
        aDevolver.append(to_string(total));

        return aDevolver;
    }
};
