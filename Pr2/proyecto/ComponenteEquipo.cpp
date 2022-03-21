#include <string>
#include "VisitantePrecio.cpp"

using namespace std;

class ComponenteEquipo
{
public:
    double costo;
    string nombre;

    ComponenteEquipo();

    ComponenteEquipo(double nCosto, string nNombre)
    {
        costo = nCosto;
        nombre = nNombre;
    }

    double getCosto()
    {
        return costo;
    }

    string getNombre()
    {
        return nombre;
    }

    virtual void Aceptar(VisitantePrecio visit)
    {
        visit.Visitar(*this);
    }
};
