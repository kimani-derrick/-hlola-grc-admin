package m;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public class f implements Iterable {

    /* renamed from: q  reason: collision with root package name */
    public c f12376q;

    /* renamed from: r  reason: collision with root package name */
    public c f12377r;

    /* renamed from: s  reason: collision with root package name */
    public final WeakHashMap f12378s = new WeakHashMap();

    /* renamed from: t  reason: collision with root package name */
    public int f12379t = 0;

    public c b(Object obj) {
        c cVar = this.f12376q;
        while (cVar != null && !cVar.f12369q.equals(obj)) {
            cVar = cVar.f12371s;
        }
        return cVar;
    }

    public Object c(Object obj) {
        c b7 = b(obj);
        if (b7 == null) {
            return null;
        }
        this.f12379t--;
        WeakHashMap weakHashMap = this.f12378s;
        if (!weakHashMap.isEmpty()) {
            for (e eVar : weakHashMap.keySet()) {
                eVar.a(b7);
            }
        }
        c cVar = b7.f12372t;
        c cVar2 = b7.f12371s;
        if (cVar != null) {
            cVar.f12371s = cVar2;
        } else {
            this.f12376q = cVar2;
        }
        c cVar3 = b7.f12371s;
        if (cVar3 != null) {
            cVar3.f12372t = cVar;
        } else {
            this.f12377r = cVar;
        }
        b7.f12371s = null;
        b7.f12372t = null;
        return b7.f12370r;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0048, code lost:
        if (r3.hasNext() != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0050, code lost:
        if (((m.b) r7).hasNext() != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0054, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:?, code lost:
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 1
            if (r7 != r6) goto L4
            return r0
        L4:
            boolean r1 = r7 instanceof m.f
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            m.f r7 = (m.f) r7
            int r1 = r6.f12379t
            int r3 = r7.f12379t
            if (r1 == r3) goto L13
            return r2
        L13:
            java.util.Iterator r1 = r6.iterator()
            java.util.Iterator r7 = r7.iterator()
        L1b:
            r3 = r1
            m.b r3 = (m.b) r3
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L44
            r4 = r7
            m.b r4 = (m.b) r4
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L44
            java.lang.Object r3 = r3.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r4.next()
            if (r3 != 0) goto L3b
            if (r4 != 0) goto L43
        L3b:
            if (r3 == 0) goto L1b
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L1b
        L43:
            return r2
        L44:
            boolean r1 = r3.hasNext()
            if (r1 != 0) goto L53
            m.b r7 = (m.b) r7
            boolean r7 = r7.hasNext()
            if (r7 != 0) goto L53
            goto L54
        L53:
            r0 = r2
        L54:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: m.f.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        Iterator it = iterator();
        int i7 = 0;
        while (true) {
            b bVar = (b) it;
            if (bVar.hasNext()) {
                i7 += ((Map.Entry) bVar.next()).hashCode();
            } else {
                return i7;
            }
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        b bVar = new b(this.f12376q, this.f12377r, 0);
        this.f12378s.put(bVar, Boolean.FALSE);
        return bVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = iterator();
        while (true) {
            b bVar = (b) it;
            if (bVar.hasNext()) {
                sb.append(((Map.Entry) bVar.next()).toString());
                if (bVar.hasNext()) {
                    sb.append(", ");
                }
            } else {
                sb.append("]");
                return sb.toString();
            }
        }
    }
}
