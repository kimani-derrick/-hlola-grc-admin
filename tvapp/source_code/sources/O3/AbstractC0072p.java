package O3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedSet;
/* renamed from: O3.p  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0072p {
    public static void b(int i7, Object[] objArr) {
        for (int i8 = 0; i8 < i7; i8++) {
            if (objArr[i8] == null) {
                StringBuilder sb = new StringBuilder(20);
                sb.append("at index ");
                sb.append(i8);
                throw new NullPointerException(sb.toString());
            }
        }
    }

    public static void c(String str, int i7) {
        if (i7 >= 0) {
            return;
        }
        StringBuilder sb = new StringBuilder(str.length() + 40);
        sb.append(str);
        sb.append(" cannot be negative but was: ");
        sb.append(i7);
        throw new IllegalArgumentException(sb.toString());
    }

    public static Object e(int i7) {
        if (i7 >= 2 && i7 <= 1073741824 && Integer.highestOneBit(i7) == i7) {
            if (i7 <= 256) {
                return new byte[i7];
            }
            if (i7 <= 65536) {
                return new short[i7];
            }
            return new int[i7];
        }
        StringBuilder sb = new StringBuilder(52);
        sb.append("must be power of 2 between 2^1 and 2^30: ");
        sb.append(i7);
        throw new IllegalArgumentException(sb.toString());
    }

    public static boolean f(Map map, Object obj) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    public static boolean g(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
                return false;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public static e0 h(Set set, N3.h hVar) {
        if (set instanceof SortedSet) {
            SortedSet sortedSet = (SortedSet) set;
            if (sortedSet instanceof e0) {
                e0 e0Var = (e0) sortedSet;
                N3.h hVar2 = e0Var.f2669r;
                hVar2.getClass();
                return new e0((SortedSet) e0Var.f2668q, new N3.i(Arrays.asList(hVar2, hVar)));
            }
            sortedSet.getClass();
            return new e0(sortedSet, hVar);
        } else if (set instanceof e0) {
            e0 e0Var2 = (e0) set;
            N3.h hVar3 = e0Var2.f2669r;
            hVar3.getClass();
            return new e0((Set) e0Var2.f2668q, new N3.i(Arrays.asList(hVar3, hVar)));
        } else {
            set.getClass();
            return new e0(set, hVar);
        }
    }

    public static Object i(Iterable iterable) {
        Object next;
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (!list.isEmpty()) {
                return list.get(list.size() - 1);
            }
            throw new NoSuchElementException();
        }
        Iterator it = iterable.iterator();
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }

    public static int j(Set set) {
        int i7;
        int i8 = 0;
        for (Object obj : set) {
            if (obj != null) {
                i7 = obj.hashCode();
            } else {
                i7 = 0;
            }
            i8 = ~(~(i8 + i7));
        }
        return i8;
    }

    public static d0 k(H h7, H h8) {
        android.support.v4.media.session.b.k(h7, "set1");
        android.support.v4.media.session.b.k(h8, "set2");
        return new d0(h7, h8);
    }

    public static int l(int i7, int i8, int i9) {
        return (i7 & (~i9)) | (i8 & i9);
    }

    public static ArrayList m(Iterator it) {
        ArrayList arrayList = new ArrayList();
        it.getClass();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002b, code lost:
        r9 = r6 & r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002d, code lost:
        if (r5 != (-1)) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002f, code lost:
        s(r1, r9, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0033, code lost:
        r13[r5] = l(r13[r5], r9, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003b, code lost:
        return r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int n(java.lang.Object r9, java.lang.Object r10, int r11, java.lang.Object r12, int[] r13, java.lang.Object[] r14, java.lang.Object[] r15) {
        /*
            int r0 = q(r9)
            r1 = r0 & r11
            int r2 = r(r1, r12)
            r3 = -1
            if (r2 != 0) goto Le
            return r3
        Le:
            int r4 = ~r11
            r0 = r0 & r4
            r5 = r3
        L11:
            int r2 = r2 + (-1)
            r6 = r13[r2]
            r7 = r6 & r4
            if (r7 != r0) goto L3c
            r7 = r14[r2]
            boolean r7 = a.AbstractC0189a.r(r9, r7)
            if (r7 == 0) goto L3c
            if (r15 == 0) goto L2b
            r7 = r15[r2]
            boolean r7 = a.AbstractC0189a.r(r10, r7)
            if (r7 == 0) goto L3c
        L2b:
            r9 = r6 & r11
            if (r5 != r3) goto L33
            s(r1, r9, r12)
            goto L3b
        L33:
            r10 = r13[r5]
            int r9 = l(r10, r9, r11)
            r13[r5] = r9
        L3b:
            return r2
        L3c:
            r5 = r6 & r11
            if (r5 != 0) goto L41
            return r3
        L41:
            r8 = r5
            r5 = r2
            r2 = r8
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: O3.AbstractC0072p.n(java.lang.Object, java.lang.Object, int, java.lang.Object, int[], java.lang.Object[], java.lang.Object[]):int");
    }

    public static void o(List list, N3.h hVar, int i7, int i8) {
        for (int size = list.size() - 1; size > i8; size--) {
            if (hVar.apply(list.get(size))) {
                list.remove(size);
            }
        }
        for (int i9 = i8 - 1; i9 >= i7; i9--) {
            list.remove(i9);
        }
    }

    public static int p(int i7) {
        return (int) (Integer.rotateLeft((int) (i7 * (-862048943)), 15) * 461845907);
    }

    public static int q(Object obj) {
        int hashCode;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        return p(hashCode);
    }

    public static int r(int i7, Object obj) {
        if (obj instanceof byte[]) {
            return ((byte[]) obj)[i7] & 255;
        }
        if (obj instanceof short[]) {
            return ((short[]) obj)[i7] & 65535;
        }
        return ((int[]) obj)[i7];
    }

    public static void s(int i7, int i8, Object obj) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i7] = (byte) i8;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i7] = (short) i8;
        } else {
            ((int[]) obj)[i7] = i8;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [H.j, java.lang.Object] */
    public H.j a() {
        c("expectedValuesPerKey", 2);
        ?? obj = new Object();
        obj.f794r = this;
        obj.f793q = 2;
        return obj;
    }

    public abstract Map d();
}
