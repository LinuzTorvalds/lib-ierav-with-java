package control;

import dao.DaoBasic;
import dao.DaoBook;
import dao.DaoIoan;
import dao.DaoMember;
import dao.DaoRow;
import java.util.List;

public class ControlGeneral implements ControlBasic {
    
    private DaoBasic dG;

    public ControlGeneral(int option) {
        switch (option) {
            case 1 : this.dG = new DaoBook();
                break;
            case 2 : this.dG = new DaoMember();
                break;
            case 3 : this.dG = new DaoRow();
                break;
            case 4 : this.dG = new DaoIoan();
        }
    }       
    
    @Override
    public boolean setManipulate(Object o, char task) {
        boolean ok = false;
        if (dG instanceof DaoBasic)
            switch (task) {
                case 'C' : ok = (dG.create(o));
                    break;
                case 'D' : ok = (dG.delete(o));
                    break;
                case 'U' : ok = (dG.update(o));
            }
        return (ok);
    }

    @Override
    public boolean export(String path) {
        boolean ok = false;
        if (dG instanceof DaoBasic)
            ok = dG.export(path);
        return (ok);
    }

    @Override
    public Object getRead(String iD1, int iD2) {
        Object o = null;
        if (dG instanceof DaoBasic)
            o = dG.read(iD1, iD2);
        return (o);
    }

    @Override
    public List<Object> getList() {
        List<Object> list = null;
        if (dG instanceof DaoBasic)
            list = dG.list();
        return list;
    }
}