#include "ComponenteEquipo.cpp"
#include <string>
#include <iostream>

using namespace std;

class Tarjeta : ComponenteEquipo
{
public:
    Tarjeta();

    Tarjeta(double nCosto, string nNombre)
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

    Tarjeta &operator=(ComponenteEquipo &otro)
    {
        costo = otro.getCosto();
        nombre = otro.getNombre();
    }
};