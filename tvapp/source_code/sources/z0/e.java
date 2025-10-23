package z0;

import A5.j;
import A5.k;
import A5.u;
import B5.f;
import B5.i;
import M5.g;
import android.database.Cursor;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import p6.l;
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final String f16397a;

    /* renamed from: b  reason: collision with root package name */
    public final Map f16398b;

    /* renamed from: c  reason: collision with root package name */
    public final Set f16399c;
    public final Set d;

    public e(String str, Map map, AbstractSet abstractSet, AbstractSet abstractSet2) {
        g.f(abstractSet, "foreignKeys");
        this.f16397a = str;
        this.f16398b = map;
        this.f16399c = abstractSet;
        this.d = abstractSet2;
    }

    /* JADX WARN: Finally extract failed */
    public static final e a(D0.c cVar, String str) {
        Map b7;
        boolean z7;
        List M6;
        i iVar;
        i iVar2;
        boolean z8;
        int i7;
        String str2;
        int i8;
        int i9;
        Throwable th;
        d dVar;
        String str3;
        D0.c cVar2 = cVar;
        StringBuilder sb = new StringBuilder("PRAGMA table_info(`");
        sb.append(str);
        String str4 = "`)";
        sb.append("`)");
        Cursor O5 = cVar2.O(sb.toString());
        try {
            String str5 = "name";
            if (O5.getColumnCount() <= 0) {
                b7 = u.f136q;
                l.i(O5, null);
            } else {
                int columnIndex = O5.getColumnIndex("name");
                int columnIndex2 = O5.getColumnIndex("type");
                int columnIndex3 = O5.getColumnIndex("notnull");
                int columnIndex4 = O5.getColumnIndex("pk");
                int columnIndex5 = O5.getColumnIndex("dflt_value");
                f fVar = new f();
                while (O5.moveToNext()) {
                    String string = O5.getString(columnIndex);
                    String string2 = O5.getString(columnIndex2);
                    if (O5.getInt(columnIndex3) != 0) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    int i10 = O5.getInt(columnIndex4);
                    String string3 = O5.getString(columnIndex5);
                    g.e(string, "name");
                    g.e(string2, "type");
                    fVar.put(string, new C1499a(i10, 2, string, string2, string3, z7));
                    columnIndex = columnIndex;
                }
                b7 = fVar.b();
                l.i(O5, null);
            }
            O5 = cVar2.O("PRAGMA foreign_key_list(`" + str + "`)");
            try {
                int columnIndex6 = O5.getColumnIndex("id");
                int columnIndex7 = O5.getColumnIndex("seq");
                int columnIndex8 = O5.getColumnIndex("table");
                int columnIndex9 = O5.getColumnIndex("on_delete");
                int columnIndex10 = O5.getColumnIndex("on_update");
                int columnIndex11 = O5.getColumnIndex("id");
                int columnIndex12 = O5.getColumnIndex("seq");
                int columnIndex13 = O5.getColumnIndex("from");
                int columnIndex14 = O5.getColumnIndex("to");
                B5.b bVar = new B5.b();
                while (O5.moveToNext()) {
                    String str6 = str5;
                    int i11 = O5.getInt(columnIndex11);
                    int i12 = columnIndex11;
                    int i13 = O5.getInt(columnIndex12);
                    int i14 = columnIndex12;
                    String string4 = O5.getString(columnIndex13);
                    int i15 = columnIndex13;
                    g.e(string4, "cursor.getString(fromColumnIndex)");
                    String string5 = O5.getString(columnIndex14);
                    g.e(string5, "cursor.getString(toColumnIndex)");
                    bVar.add(new C1501c(i11, i13, string4, string5));
                    b7 = b7;
                    str5 = str6;
                    columnIndex11 = i12;
                    columnIndex12 = i14;
                    columnIndex13 = i15;
                    columnIndex14 = columnIndex14;
                }
                Map map = b7;
                String str7 = str5;
                B5.b c5 = m3.g.c(bVar);
                g.f(c5, "<this>");
                if (c5.b() <= 1) {
                    M6 = k.l0(c5);
                } else {
                    Object[] array = c5.toArray(new Comparable[0]);
                    Comparable[] comparableArr = (Comparable[]) array;
                    if (comparableArr.length > 1) {
                        Arrays.sort(comparableArr);
                    }
                    M6 = j.M(array);
                }
                O5.moveToPosition(-1);
                i iVar3 = new i();
                while (O5.moveToNext()) {
                    if (O5.getInt(columnIndex7) == 0) {
                        int i16 = O5.getInt(columnIndex6);
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        ArrayList arrayList3 = new ArrayList();
                        for (Object obj : M6) {
                            List list = M6;
                            if (((C1501c) obj).f16390q == i16) {
                                arrayList3.add(obj);
                            }
                            M6 = list;
                        }
                        List list2 = M6;
                        Iterator it = arrayList3.iterator();
                        while (it.hasNext()) {
                            C1501c c1501c = (C1501c) it.next();
                            arrayList.add(c1501c.f16392s);
                            arrayList2.add(c1501c.f16393t);
                        }
                        String string6 = O5.getString(columnIndex8);
                        g.e(string6, "cursor.getString(tableColumnIndex)");
                        String string7 = O5.getString(columnIndex9);
                        g.e(string7, "cursor.getString(onDeleteColumnIndex)");
                        String string8 = O5.getString(columnIndex10);
                        g.e(string8, "cursor.getString(onUpdateColumnIndex)");
                        iVar3.add(new C1500b(string6, string7, string8, arrayList, arrayList2));
                        columnIndex6 = columnIndex6;
                        M6 = list2;
                    }
                }
                i d = l.d(iVar3);
                l.i(O5, null);
                O5 = cVar2.O("PRAGMA index_list(`" + str + "`)");
                String str8 = str7;
                try {
                    int columnIndex15 = O5.getColumnIndex(str8);
                    int columnIndex16 = O5.getColumnIndex("origin");
                    int columnIndex17 = O5.getColumnIndex("unique");
                    if (columnIndex15 == -1 || columnIndex16 == -1 || columnIndex17 == -1) {
                        iVar = null;
                        l.i(O5, null);
                    } else {
                        i iVar4 = new i();
                        while (O5.moveToNext()) {
                            if (g.a("c", O5.getString(columnIndex16))) {
                                String string9 = O5.getString(columnIndex15);
                                if (O5.getInt(columnIndex17) == 1) {
                                    z8 = true;
                                } else {
                                    z8 = false;
                                }
                                g.e(string9, str8);
                                Cursor O6 = cVar2.O("PRAGMA index_xinfo(`" + string9 + str4);
                                int columnIndex18 = O6.getColumnIndex("seqno");
                                int columnIndex19 = O6.getColumnIndex("cid");
                                int columnIndex20 = O6.getColumnIndex(str8);
                                int columnIndex21 = O6.getColumnIndex("desc");
                                String str9 = str8;
                                if (columnIndex18 == -1 || columnIndex19 == -1 || columnIndex20 == -1 || columnIndex21 == -1) {
                                    i7 = columnIndex15;
                                    str2 = str4;
                                    i8 = columnIndex16;
                                    i9 = columnIndex17;
                                    th = null;
                                    l.i(O6, null);
                                    dVar = null;
                                } else {
                                    TreeMap treeMap = new TreeMap();
                                    i7 = columnIndex15;
                                    TreeMap treeMap2 = new TreeMap();
                                    while (O6.moveToNext()) {
                                        if (O6.getInt(columnIndex19) >= 0) {
                                            int i17 = O6.getInt(columnIndex18);
                                            String str10 = str4;
                                            String string10 = O6.getString(columnIndex20);
                                            if (O6.getInt(columnIndex21) > 0) {
                                                str3 = "DESC";
                                            } else {
                                                str3 = "ASC";
                                            }
                                            int i18 = columnIndex21;
                                            String str11 = str3;
                                            int i19 = columnIndex16;
                                            Integer valueOf = Integer.valueOf(i17);
                                            g.e(string10, "columnName");
                                            treeMap.put(valueOf, string10);
                                            treeMap2.put(Integer.valueOf(i17), str11);
                                            str4 = str10;
                                            columnIndex16 = i19;
                                            columnIndex21 = i18;
                                            columnIndex17 = columnIndex17;
                                        }
                                    }
                                    str2 = str4;
                                    i8 = columnIndex16;
                                    i9 = columnIndex17;
                                    Collection values = treeMap.values();
                                    g.e(values, "columnsMap.values");
                                    List l02 = k.l0(values);
                                    Collection values2 = treeMap2.values();
                                    g.e(values2, "ordersMap.values");
                                    dVar = new d(string9, z8, l02, k.l0(values2));
                                    l.i(O6, null);
                                    th = null;
                                }
                                if (dVar == null) {
                                    l.i(O5, th);
                                    iVar2 = null;
                                    break;
                                }
                                iVar4.add(dVar);
                                cVar2 = cVar;
                                columnIndex15 = i7;
                                str8 = str9;
                                str4 = str2;
                                columnIndex16 = i8;
                                columnIndex17 = i9;
                            }
                        }
                        iVar = l.d(iVar4);
                        l.i(O5, null);
                    }
                    iVar2 = iVar;
                    return new e(str, map, d, iVar2);
                } finally {
                }
            } catch (Throwable th2) {
                try {
                    throw th2;
                } finally {
                }
            }
        } finally {
            try {
                throw th2;
            } finally {
            }
        }
    }

    public final boolean equals(Object obj) {
        Set set;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (!g.a(this.f16397a, eVar.f16397a) || !g.a(this.f16398b, eVar.f16398b) || !g.a(this.f16399c, eVar.f16399c)) {
            return false;
        }
        Set set2 = this.d;
        if (set2 == null || (set = eVar.d) == null) {
            return true;
        }
        return g.a(set2, set);
    }

    public final int hashCode() {
        int hashCode = this.f16398b.hashCode();
        return this.f16399c.hashCode() + ((hashCode + (this.f16397a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "TableInfo{name='" + this.f16397a + "', columns=" + this.f16398b + ", foreignKeys=" + this.f16399c + ", indices=" + this.d + '}';
    }
}
