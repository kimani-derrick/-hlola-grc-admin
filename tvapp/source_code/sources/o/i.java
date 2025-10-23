package o;

import S0.l;
import android.view.View;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import m4.C0997b;
import w0.U;
import w0.p0;
/* loaded from: classes.dex */
public class i {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f12802a;

    /* renamed from: b  reason: collision with root package name */
    public int f12803b;

    /* renamed from: c  reason: collision with root package name */
    public int f12804c;
    public int d;

    /* renamed from: e  reason: collision with root package name */
    public int f12805e;
    public final Object f;

    /* renamed from: g  reason: collision with root package name */
    public final Object f12806g;

    public i(int i7) {
        this.f12802a = 0;
        this.f12803b = i7;
        if (i7 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0".toString());
        }
        this.f = new l(1);
        this.f12806g = new C0997b(1);
    }

    public void a() {
        ArrayList arrayList = (ArrayList) this.f;
        View view = (View) arrayList.get(arrayList.size() - 1);
        this.f12804c = ((StaggeredGridLayoutManager) this.f12806g).f6975r.b(view);
        ((p0) view.getLayoutParams()).getClass();
    }

    public void b() {
        ((ArrayList) this.f).clear();
        this.f12803b = Integer.MIN_VALUE;
        this.f12804c = Integer.MIN_VALUE;
        this.d = 0;
    }

    public Object c(Object obj) {
        M5.g.f(obj, "key");
        return null;
    }

    public void d(Object obj, Object obj2, Object obj3) {
        M5.g.f(obj, "key");
        M5.g.f(obj2, "oldValue");
    }

    public int e() {
        boolean z7 = ((StaggeredGridLayoutManager) this.f12806g).f6980w;
        ArrayList arrayList = (ArrayList) this.f;
        if (z7) {
            return g(arrayList.size() - 1, -1);
        }
        return g(0, arrayList.size());
    }

    public int f() {
        boolean z7 = ((StaggeredGridLayoutManager) this.f12806g).f6980w;
        ArrayList arrayList = (ArrayList) this.f;
        if (z7) {
            return g(0, arrayList.size());
        }
        return g(arrayList.size() - 1, -1);
    }

    public int g(int i7, int i8) {
        int i9;
        boolean z7;
        StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) this.f12806g;
        int k5 = staggeredGridLayoutManager.f6975r.k();
        int g7 = staggeredGridLayoutManager.f6975r.g();
        if (i8 > i7) {
            i9 = 1;
        } else {
            i9 = -1;
        }
        while (i7 != i8) {
            View view = (View) ((ArrayList) this.f).get(i7);
            int e3 = staggeredGridLayoutManager.f6975r.e(view);
            int b7 = staggeredGridLayoutManager.f6975r.b(view);
            boolean z8 = false;
            if (e3 <= g7) {
                z7 = true;
            } else {
                z7 = false;
            }
            if (b7 >= k5) {
                z8 = true;
            }
            if (z7 && z8 && (e3 < k5 || b7 > g7)) {
                return U.O(view);
            }
            i7 += i9;
        }
        return -1;
    }

    public Object h(Object obj) {
        Object put;
        M5.g.f(obj, "key");
        synchronized (((C0997b) this.f12806g)) {
            l lVar = (l) this.f;
            lVar.getClass();
            Object obj2 = lVar.f3054a.get(obj);
            if (obj2 != null) {
                this.d++;
                return obj2;
            }
            this.f12805e++;
            Object c5 = c(obj);
            if (c5 == null) {
                return null;
            }
            synchronized (((C0997b) this.f12806g)) {
                l lVar2 = (l) this.f;
                lVar2.getClass();
                put = lVar2.f3054a.put(obj, c5);
                if (put != null) {
                    l lVar3 = (l) this.f;
                    lVar3.getClass();
                    lVar3.f3054a.put(obj, put);
                } else {
                    this.f12804c += o(obj, c5);
                }
            }
            if (put != null) {
                d(obj, c5, put);
                return put;
            }
            r(this.f12803b);
            return c5;
        }
    }

    public int i(int i7) {
        int i8 = this.f12804c;
        if (i8 != Integer.MIN_VALUE) {
            return i8;
        }
        if (((ArrayList) this.f).size() == 0) {
            return i7;
        }
        a();
        return this.f12804c;
    }

    public View j(int i7, int i8) {
        ArrayList arrayList = (ArrayList) this.f;
        StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) this.f12806g;
        View view = null;
        if (i8 == -1) {
            int size = arrayList.size();
            int i9 = 0;
            while (i9 < size) {
                View view2 = (View) arrayList.get(i9);
                if ((staggeredGridLayoutManager.f6980w && U.O(view2) <= i7) || ((!staggeredGridLayoutManager.f6980w && U.O(view2) >= i7) || !view2.hasFocusable())) {
                    break;
                }
                i9++;
                view = view2;
            }
        } else {
            int size2 = arrayList.size() - 1;
            while (size2 >= 0) {
                View view3 = (View) arrayList.get(size2);
                if ((staggeredGridLayoutManager.f6980w && U.O(view3) >= i7) || ((!staggeredGridLayoutManager.f6980w && U.O(view3) <= i7) || !view3.hasFocusable())) {
                    break;
                }
                size2--;
                view = view3;
            }
        }
        return view;
    }

    public int k(int i7) {
        int i8 = this.f12803b;
        if (i8 != Integer.MIN_VALUE) {
            return i8;
        }
        if (((ArrayList) this.f).size() == 0) {
            return i7;
        }
        View view = (View) ((ArrayList) this.f).get(0);
        this.f12803b = ((StaggeredGridLayoutManager) this.f12806g).f6975r.e(view);
        ((p0) view.getLayoutParams()).getClass();
        return this.f12803b;
    }

    public int l() {
        int i7;
        synchronized (((C0997b) this.f12806g)) {
            i7 = this.f12803b;
        }
        return i7;
    }

    public Object m(Object obj, Object obj2) {
        Object put;
        M5.g.f(obj, "key");
        M5.g.f(obj2, "value");
        synchronized (((C0997b) this.f12806g)) {
            this.f12804c += o(obj, obj2);
            l lVar = (l) this.f;
            lVar.getClass();
            put = lVar.f3054a.put(obj, obj2);
            if (put != null) {
                this.f12804c -= o(obj, put);
            }
        }
        if (put != null) {
            d(obj, put, obj2);
        }
        r(this.f12803b);
        return put;
    }

    public Object n(Object obj) {
        Object remove;
        M5.g.f(obj, "key");
        synchronized (((C0997b) this.f12806g)) {
            l lVar = (l) this.f;
            lVar.getClass();
            remove = lVar.f3054a.remove(obj);
            if (remove != null) {
                this.f12804c -= o(obj, remove);
            }
        }
        if (remove != null) {
            d(obj, remove, null);
        }
        return remove;
    }

    public int o(Object obj, Object obj2) {
        int p3 = p(obj, obj2);
        if (p3 >= 0) {
            return p3;
        }
        throw new IllegalStateException(("Negative size: " + obj + '=' + obj2).toString());
    }

    public int p(Object obj, Object obj2) {
        M5.g.f(obj, "key");
        M5.g.f(obj2, "value");
        return 1;
    }

    public LinkedHashMap q() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        synchronized (((C0997b) this.f12806g)) {
            Set<Map.Entry> entrySet = ((l) this.f).f3054a.entrySet();
            M5.g.e(entrySet, "map.entries");
            for (Map.Entry entry : entrySet) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x009c, code lost:
        throw new java.lang.IllegalStateException("LruCache.sizeOf() is reporting inconsistent results!".toString());
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0067 A[Catch: all -> 0x001a, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x001a, blocks: (B:4:0x0005, B:6:0x0009, B:8:0x0015, B:13:0x001d, B:15:0x0021, B:18:0x002e, B:20:0x0042, B:28:0x0061, B:32:0x0067, B:23:0x004c, B:24:0x0052, B:27:0x005d, B:37:0x0091, B:38:0x009c), top: B:41:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0065 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void r(int r7) {
        /*
            r6 = this;
        L0:
            java.lang.Object r0 = r6.f12806g
            m4.b r0 = (m4.C0997b) r0
            monitor-enter(r0)
            int r1 = r6.f12804c     // Catch: java.lang.Throwable -> L1a
            if (r1 < 0) goto L91
            java.lang.Object r1 = r6.f     // Catch: java.lang.Throwable -> L1a
            S0.l r1 = (S0.l) r1     // Catch: java.lang.Throwable -> L1a
            java.util.LinkedHashMap r1 = r1.f3054a     // Catch: java.lang.Throwable -> L1a
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L1a
            if (r1 == 0) goto L1d
            int r1 = r6.f12804c     // Catch: java.lang.Throwable -> L1a
            if (r1 != 0) goto L91
            goto L1d
        L1a:
            r7 = move-exception
            goto L9d
        L1d:
            int r1 = r6.f12804c     // Catch: java.lang.Throwable -> L1a
            if (r1 <= r7) goto L8f
            java.lang.Object r1 = r6.f     // Catch: java.lang.Throwable -> L1a
            S0.l r1 = (S0.l) r1     // Catch: java.lang.Throwable -> L1a
            java.util.LinkedHashMap r1 = r1.f3054a     // Catch: java.lang.Throwable -> L1a
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L1a
            if (r1 == 0) goto L2e
            goto L8f
        L2e:
            java.lang.Object r1 = r6.f     // Catch: java.lang.Throwable -> L1a
            S0.l r1 = (S0.l) r1     // Catch: java.lang.Throwable -> L1a
            java.util.LinkedHashMap r1 = r1.f3054a     // Catch: java.lang.Throwable -> L1a
            java.util.Set r1 = r1.entrySet()     // Catch: java.lang.Throwable -> L1a
            java.lang.String r2 = "map.entries"
            M5.g.e(r1, r2)     // Catch: java.lang.Throwable -> L1a
            boolean r2 = r1 instanceof java.util.List     // Catch: java.lang.Throwable -> L1a
            r3 = 0
            if (r2 == 0) goto L52
            java.util.List r1 = (java.util.List) r1     // Catch: java.lang.Throwable -> L1a
            boolean r2 = r1.isEmpty()     // Catch: java.lang.Throwable -> L1a
            if (r2 == 0) goto L4c
        L4a:
            r1 = r3
            goto L61
        L4c:
            r2 = 0
            java.lang.Object r1 = r1.get(r2)     // Catch: java.lang.Throwable -> L1a
            goto L61
        L52:
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L1a
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L1a
            if (r2 != 0) goto L5d
            goto L4a
        L5d:
            java.lang.Object r1 = r1.next()     // Catch: java.lang.Throwable -> L1a
        L61:
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch: java.lang.Throwable -> L1a
            if (r1 != 0) goto L67
            monitor-exit(r0)
            return
        L67:
            java.lang.Object r2 = r1.getKey()     // Catch: java.lang.Throwable -> L1a
            java.lang.Object r1 = r1.getValue()     // Catch: java.lang.Throwable -> L1a
            java.lang.Object r4 = r6.f     // Catch: java.lang.Throwable -> L1a
            S0.l r4 = (S0.l) r4     // Catch: java.lang.Throwable -> L1a
            r4.getClass()     // Catch: java.lang.Throwable -> L1a
            java.lang.String r5 = "key"
            M5.g.f(r2, r5)     // Catch: java.lang.Throwable -> L1a
            java.util.LinkedHashMap r4 = r4.f3054a     // Catch: java.lang.Throwable -> L1a
            r4.remove(r2)     // Catch: java.lang.Throwable -> L1a
            int r4 = r6.f12804c     // Catch: java.lang.Throwable -> L1a
            int r5 = r6.o(r2, r1)     // Catch: java.lang.Throwable -> L1a
            int r4 = r4 - r5
            r6.f12804c = r4     // Catch: java.lang.Throwable -> L1a
            monitor-exit(r0)
            r6.d(r2, r1, r3)
            goto L0
        L8f:
            monitor-exit(r0)
            return
        L91:
            java.lang.String r7 = "LruCache.sizeOf() is reporting inconsistent results!"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L1a
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L1a
            r1.<init>(r7)     // Catch: java.lang.Throwable -> L1a
            throw r1     // Catch: java.lang.Throwable -> L1a
        L9d:
            monitor-exit(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: o.i.r(int):void");
    }

    public String toString() {
        int i7;
        String str;
        switch (this.f12802a) {
            case 0:
                synchronized (((C0997b) this.f12806g)) {
                    try {
                        int i8 = this.d;
                        int i9 = this.f12805e + i8;
                        if (i9 != 0) {
                            i7 = (i8 * 100) / i9;
                        } else {
                            i7 = 0;
                        }
                        str = "LruCache[maxSize=" + this.f12803b + ",hits=" + this.d + ",misses=" + this.f12805e + ",hitRate=" + i7 + "%]";
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return str;
            default:
                return super.toString();
        }
    }

    public i(StaggeredGridLayoutManager staggeredGridLayoutManager, int i7) {
        this.f12802a = 1;
        this.f12806g = staggeredGridLayoutManager;
        this.f = new ArrayList();
        this.f12803b = Integer.MIN_VALUE;
        this.f12804c = Integer.MIN_VALUE;
        this.d = 0;
        this.f12805e = i7;
    }
}
