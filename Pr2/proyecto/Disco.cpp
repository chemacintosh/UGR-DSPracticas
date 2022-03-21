#include "ComponenteEquipo.cpp"
#include <string>
#include <iostream>

using namespace std;

class Disco : ComponenteEquipo
{
public:
    Disco();

    Disco(double nCosto, string nNombre)
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

    Disco &operator=(ComponenteEquipo &otro)
    {
        costo = otro.getCosto();
        nombre = otro.getNombre();
    }
};