/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composite;

import java.util.ArrayList;
import java.util.List;

// Somut yapımızdır.
// UML diyagramındaki Composite kısmına denk gelmektedir.
// Component (ICatalogComponent) listesi tutmaktadır.
public class Kategori implements ICatalogComponent {
    private String _name;

    private List<ICatalogComponent> _components;

    public Kategori(String name) {
        _name = name;
        _components = new ArrayList<ICatalogComponent>();
    }

    public void add(ICatalogComponent catalogComponent) {
        _components.add(catalogComponent);
    }

    public void remove(ICatalogComponent catalogComponent) {
        _components.remove(catalogComponent);
    }

    public void drawHierarchy() {
        System.out.println(_name);
        for (ICatalogComponent component : _components) {
            component.drawHierarchy();
        }
    }
}