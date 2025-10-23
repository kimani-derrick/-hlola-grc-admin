package A5;

import a.AbstractC0189a;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import r0.AbstractC1111a;
/* loaded from: classes.dex */
public abstract class k extends q {
    public static boolean T(Iterable iterable, Object obj) {
        int i7;
        M5.g.f(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).contains(obj);
        }
        if (iterable instanceof List) {
            i7 = ((List) iterable).indexOf(obj);
        } else {
            int i8 = 0;
            for (Object obj2 : iterable) {
                if (i8 >= 0) {
                    if (M5.g.a(obj, obj2)) {
                        i7 = i8;
                    } else {
                        i8++;
                    }
                } else {
                    l.O();
                    throw null;
                }
            }
            return false;
        }
        if (i7 < 0) {
            return false;
        }
        return true;
    }

    public static ArrayList U(Iterable iterable) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static Object V(Iterable iterable) {
        M5.g.f(iterable, "<this>");
        if (iterable instanceof List) {
            return W((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static Object W(List list) {
        M5.g.f(list, "<this>");
        if (!list.isEmpty()) {
            return list.get(0);
        }
        throw new NoSuchElementException("List is empty.");
    }

    public static Object X(List list) {
        M5.g.f(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static final void Y(Iterable iterable, StringBuilder sb, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i7, CharSequence charSequence4, L5.l lVar) {
        M5.g.f(iterable, "<this>");
        M5.g.f(charSequence, "separator");
        M5.g.f(charSequence2, "prefix");
        M5.g.f(charSequence3, "postfix");
        M5.g.f(charSequence4, "truncated");
        sb.append(charSequence2);
        int i8 = 0;
        for (Object obj : iterable) {
            i8++;
            if (i8 > 1) {
                sb.append(charSequence);
            }
            if (i7 >= 0 && i8 > i7) {
                break;
            }
            AbstractC0189a.b(sb, obj, lVar);
        }
        if (i7 >= 0 && i8 > i7) {
            sb.append(charSequence4);
        }
        sb.append(charSequence3);
    }

    public static /* synthetic */ void Z(ArrayList arrayList, StringBuilder sb) {
        Y(arrayList, sb, "\n", "", "", -1, "...", null);
    }

    public static String a0(Iterable iterable, String str, String str2, String str3, L5.l lVar, int i7) {
        String str4;
        String str5;
        if ((i7 & 1) != 0) {
            str = ", ";
        }
        String str6 = str;
        if ((i7 & 2) != 0) {
            str4 = "";
        } else {
            str4 = str2;
        }
        if ((i7 & 4) != 0) {
            str5 = "";
        } else {
            str5 = str3;
        }
        if ((i7 & 32) != 0) {
            lVar = null;
        }
        M5.g.f(iterable, "<this>");
        M5.g.f(str6, "separator");
        M5.g.f(str4, "prefix");
        M5.g.f(str5, "postfix");
        StringBuilder sb = new StringBuilder();
        Y(iterable, sb, str6, str4, str5, -1, "...", lVar);
        String sb2 = sb.toString();
        M5.g.e(sb2, "toString(...)");
        return sb2;
    }

    public static Object b0(List list) {
        M5.g.f(list, "<this>");
        if (!list.isEmpty()) {
            return list.get(l.K(list));
        }
        throw new NoSuchElementException("List is empty.");
    }

    public static Object c0(List list) {
        M5.g.f(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    public static Comparable d0(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Comparable comparable = (Comparable) it.next();
        while (it.hasNext()) {
            Comparable comparable2 = (Comparable) it.next();
            if (comparable.compareTo(comparable2) < 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    public static ArrayList e0(Collection collection, Iterable iterable) {
        M5.g.f(collection, "<this>");
        if (iterable instanceof Collection) {
            Collection collection2 = (Collection) iterable;
            ArrayList arrayList = new ArrayList(collection2.size() + collection.size());
            arrayList.addAll(collection);
            arrayList.addAll(collection2);
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(collection);
        q.R(iterable, arrayList2);
        return arrayList2;
    }

    public static ArrayList f0(Collection collection, Object obj) {
        M5.g.f(collection, "<this>");
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(obj);
        return arrayList;
    }

    public static List g0(Iterable iterable) {
        M5.g.f(iterable, "<this>");
        if ((iterable instanceof Collection) && ((Collection) iterable).size() <= 1) {
            return l0(iterable);
        }
        List n02 = n0(iterable);
        Collections.reverse(n02);
        return n02;
    }

    public static List h0(ArrayList arrayList, Comparator comparator) {
        if (arrayList.size() <= 1) {
            return l0(arrayList);
        }
        Object[] array = arrayList.toArray(new Object[0]);
        M5.g.f(array, "<this>");
        if (array.length > 1) {
            Arrays.sort(array, comparator);
        }
        return j.M(array);
    }

    public static List i0(Iterable iterable, int i7) {
        if (i7 >= 0) {
            if (i7 == 0) {
                return t.f135q;
            }
            if (iterable instanceof Collection) {
                if (i7 >= ((Collection) iterable).size()) {
                    return l0(iterable);
                }
                if (i7 == 1) {
                    return m3.g.z(V(iterable));
                }
            }
            ArrayList arrayList = new ArrayList(i7);
            int i8 = 0;
            for (Object obj : iterable) {
                arrayList.add(obj);
                i8++;
                if (i8 == i7) {
                    break;
                }
            }
            return l.N(arrayList);
        }
        throw new IllegalArgumentException(AbstractC1111a.n(i7, "Requested element count ", " is less than zero.").toString());
    }

    public static final void j0(Iterable iterable, AbstractCollection abstractCollection) {
        M5.g.f(iterable, "<this>");
        for (Object obj : iterable) {
            abstractCollection.add(obj);
        }
    }

    public static int[] k0(ArrayList arrayList) {
        int[] iArr = new int[arrayList.size()];
        Iterator it = arrayList.iterator();
        int i7 = 0;
        while (it.hasNext()) {
            iArr[i7] = ((Number) it.next()).intValue();
            i7++;
        }
        return iArr;
    }

    public static List l0(Iterable iterable) {
        Object next;
        M5.g.f(iterable, "<this>");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size != 1) {
                    return m0(collection);
                }
                if (iterable instanceof List) {
                    next = ((List) iterable).get(0);
                } else {
                    next = iterable.iterator().next();
                }
                return m3.g.z(next);
            }
            return t.f135q;
        }
        return l.N(n0(iterable));
    }

    public static ArrayList m0(Collection collection) {
        M5.g.f(collection, "<this>");
        return new ArrayList(collection);
    }

    public static final List n0(Iterable iterable) {
        M5.g.f(iterable, "<this>");
        if (iterable instanceof Collection) {
            return m0((Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        j0(iterable, arrayList);
        return arrayList;
    }

    public static Set o0(Iterable iterable) {
        Object next;
        M5.g.f(iterable, "<this>");
        boolean z7 = iterable instanceof Collection;
        v vVar = v.f137q;
        if (z7) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size != 1) {
                    LinkedHashSet linkedHashSet = new LinkedHashSet(w.J(collection.size()));
                    j0(iterable, linkedHashSet);
                    return linkedHashSet;
                }
                if (iterable instanceof List) {
                    next = ((List) iterable).get(0);
                } else {
                    next = iterable.iterator().next();
                }
                Set singleton = Collections.singleton(next);
                M5.g.e(singleton, "singleton(...)");
                return singleton;
            }
            return vVar;
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        j0(iterable, linkedHashSet2);
        int size2 = linkedHashSet2.size();
        if (size2 != 0) {
            if (size2 != 1) {
                return linkedHashSet2;
            }
            Set singleton2 = Collections.singleton(linkedHashSet2.iterator().next());
            M5.g.e(singleton2, "singleton(...)");
            return singleton2;
        }
        return vVar;
    }
}
