package x0;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
/* renamed from: x0.n  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1458n implements C0.c, C0.b {

    /* renamed from: y  reason: collision with root package name */
    public static final TreeMap f16174y = new TreeMap();

    /* renamed from: q  reason: collision with root package name */
    public final int f16175q;

    /* renamed from: r  reason: collision with root package name */
    public volatile String f16176r;

    /* renamed from: s  reason: collision with root package name */
    public final long[] f16177s;

    /* renamed from: t  reason: collision with root package name */
    public final double[] f16178t;

    /* renamed from: u  reason: collision with root package name */
    public final String[] f16179u;

    /* renamed from: v  reason: collision with root package name */
    public final byte[][] f16180v;

    /* renamed from: w  reason: collision with root package name */
    public final int[] f16181w;

    /* renamed from: x  reason: collision with root package name */
    public int f16182x;

    public C1458n(int i7) {
        this.f16175q = i7;
        int i8 = i7 + 1;
        this.f16181w = new int[i8];
        this.f16177s = new long[i8];
        this.f16178t = new double[i8];
        this.f16179u = new String[i8];
        this.f16180v = new byte[i8];
    }

    public static final C1458n a(String str, int i7) {
        TreeMap treeMap = f16174y;
        synchronized (treeMap) {
            Map.Entry ceilingEntry = treeMap.ceilingEntry(Integer.valueOf(i7));
            if (ceilingEntry != null) {
                treeMap.remove(ceilingEntry.getKey());
                C1458n c1458n = (C1458n) ceilingEntry.getValue();
                c1458n.f16176r = str;
                c1458n.f16182x = i7;
                return c1458n;
            }
            C1458n c1458n2 = new C1458n(i7);
            c1458n2.f16176r = str;
            c1458n2.f16182x = i7;
            return c1458n2;
        }
    }

    @Override // C0.b
    public final void A(int i7, byte[] bArr) {
        this.f16181w[i7] = 5;
        this.f16180v[i7] = bArr;
    }

    @Override // C0.b
    public final void B(int i7) {
        this.f16181w[i7] = 1;
    }

    @Override // C0.b
    public final void C(String str, int i7) {
        this.f16181w[i7] = 4;
        this.f16179u[i7] = str;
    }

    @Override // C0.b
    public final void E(int i7, double d) {
        this.f16181w[i7] = 3;
        this.f16178t[i7] = d;
    }

    @Override // C0.b
    public final void P(long j7, int i7) {
        this.f16181w[i7] = 2;
        this.f16177s[i7] = j7;
    }

    @Override // C0.c
    public final void b(C0.b bVar) {
        int i7 = this.f16182x;
        if (1 <= i7) {
            int i8 = 1;
            while (true) {
                int i9 = this.f16181w[i8];
                if (i9 != 1) {
                    if (i9 != 2) {
                        if (i9 != 3) {
                            if (i9 != 4) {
                                if (i9 == 5) {
                                    byte[] bArr = this.f16180v[i8];
                                    if (bArr != null) {
                                        bVar.A(i8, bArr);
                                    } else {
                                        throw new IllegalArgumentException("Required value was null.".toString());
                                    }
                                }
                            } else {
                                String str = this.f16179u[i8];
                                if (str != null) {
                                    bVar.C(str, i8);
                                } else {
                                    throw new IllegalArgumentException("Required value was null.".toString());
                                }
                            }
                        } else {
                            bVar.E(i8, this.f16178t[i8]);
                        }
                    } else {
                        bVar.P(this.f16177s[i8], i8);
                    }
                } else {
                    bVar.B(i8);
                }
                if (i8 != i7) {
                    i8++;
                } else {
                    return;
                }
            }
        }
    }

    @Override // C0.c
    public final String f() {
        String str = this.f16176r;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    public final void h() {
        TreeMap treeMap = f16174y;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.f16175q), this);
            if (treeMap.size() > 15) {
                int size = treeMap.size() - 10;
                Iterator it = treeMap.descendingKeySet().iterator();
                M5.g.e(it, "queryPool.descendingKeySet().iterator()");
                while (true) {
                    int i7 = size - 1;
                    if (size <= 0) {
                        break;
                    }
                    it.next();
                    it.remove();
                    size = i7;
                }
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
