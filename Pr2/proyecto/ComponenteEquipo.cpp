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