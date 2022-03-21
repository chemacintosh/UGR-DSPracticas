#include "ComponenteEquipo.cpp"
#include <string>
#include <iostream>

using namespace std;

class Bus : ComponenteEquipo
{
public:
    Bus();

    Bus(double nCosto, string nNombre)
    {
        costo = nCosto;
        nombre = nNombre;
    }

    void Aceptar(VisitantePrecio pVisit) override
    {
        pVisit.Visitar(*this);
    }

    double getCosto()
    {
        return costo;
    }

    Bus &operator=(ComponenteEquipo &otro)
    {
        costo = otro.getCosto();
        nombre = otro.getNombre();
    }
};