package n5;

import androidx.datastore.preferences.protobuf.C0230i;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Set;
/* loaded from: classes.dex */
public final class v extends AbstractMap implements Serializable {

    /* renamed from: y  reason: collision with root package name */
    public static final r f12744y = new r(0);

    /* renamed from: w  reason: collision with root package name */
    public t f12751w;

    /* renamed from: x  reason: collision with root package name */
    public t f12752x;

    /* renamed from: t  reason: collision with root package name */
    public int f12748t = 0;

    /* renamed from: u  reason: collision with root package name */
    public int f12749u = 0;

    /* renamed from: q  reason: collision with root package name */
    public final Comparator f12745q = f12744y;

    /* renamed from: s  reason: collision with root package name */
    public final u f12747s = new u();

    /* renamed from: r  reason: collision with root package name */
    public u[] f12746r = new u[16];

    /* renamed from: v  reason: collision with root package name */
    public int f12750v = 12;

    public final u a(Object obj, boolean z7) {
        u uVar;
        int i7;
        u uVar2;
        u uVar3;
        u uVar4;
        u uVar5;
        u uVar6;
        u uVar7;
        Comparable comparable;
        int compare;
        u uVar8;
        u[] uVarArr = this.f12746r;
        int hashCode = obj.hashCode();
        int i8 = hashCode ^ ((hashCode >>> 20) ^ (hashCode >>> 12));
        int i9 = ((i8 >>> 7) ^ i8) ^ (i8 >>> 4);
        int length = i9 & (uVarArr.length - 1);
        u uVar9 = uVarArr[length];
        r rVar = f12744y;
        u uVar10 = null;
        Comparator comparator = this.f12745q;
        if (uVar9 != null) {
            if (comparator == rVar) {
                comparable = (Comparable) obj;
            } else {
                comparable = null;
            }
            while (true) {
                Object obj2 = uVar9.f12740v;
                if (comparable != null) {
                    compare = comparable.compareTo(obj2);
                } else {
                    compare = comparator.compare(obj, obj2);
                }
                if (compare == 0) {
                    return uVar9;
                }
                if (compare < 0) {
                    uVar8 = uVar9.f12736r;
                } else {
                    uVar8 = uVar9.f12737s;
                }
                if (uVar8 == null) {
                    i7 = compare;
                    uVar = uVar9;
                    break;
                }
                uVar9 = uVar8;
            }
        } else {
            uVar = uVar9;
            i7 = 0;
        }
        if (!z7) {
            return null;
        }
        u uVar11 = this.f12747s;
        if (uVar == null) {
            if (comparator == rVar && !(obj instanceof Comparable)) {
                throw new ClassCastException(obj.getClass().getName().concat(" is not Comparable"));
            }
            uVar2 = new u(uVar, obj, i9, uVar11, uVar11.f12739u);
            uVarArr[length] = uVar2;
        } else {
            u uVar12 = new u(uVar, obj, i9, uVar11, uVar11.f12739u);
            if (i7 < 0) {
                uVar.f12736r = uVar12;
            } else {
                uVar.f12737s = uVar12;
            }
            b(uVar, true);
            uVar2 = uVar12;
        }
        int i10 = this.f12748t;
        this.f12748t = i10 + 1;
        if (i10 > this.f12750v) {
            u[] uVarArr2 = this.f12746r;
            int length2 = uVarArr2.length;
            int i11 = length2 * 2;
            u[] uVarArr3 = new u[i11];
            C0230i c0230i = new C0230i(2);
            C0230i c0230i2 = new C0230i(2);
            int i12 = 0;
            while (i12 < length2) {
                u uVar13 = uVarArr2[i12];
                if (uVar13 == null) {
                    uVar4 = uVar10;
                } else {
                    u uVar14 = uVar10;
                    for (u uVar15 = uVar13; uVar15 != null; uVar15 = uVar15.f12736r) {
                        uVar15.f12735q = uVar14;
                        uVar14 = uVar15;
                    }
                    int i13 = 0;
                    int i14 = 0;
                    while (true) {
                        if (uVar14 == null) {
                            u uVar16 = uVar14;
                            uVar14 = uVar10;
                            uVar3 = uVar16;
                        } else {
                            u uVar17 = uVar14.f12735q;
                            uVar14.f12735q = uVar10;
                            u uVar18 = uVar14.f12737s;
                            while (true) {
                                u uVar19 = uVar17;
                                uVar17 = uVar18;
                                uVar3 = uVar19;
                                if (uVar17 == null) {
                                    break;
                                }
                                uVar17.f12735q = uVar3;
                                uVar18 = uVar17.f12736r;
                            }
                        }
                        if (uVar14 == null) {
                            break;
                        }
                        if ((uVar14.f12741w & length2) == 0) {
                            i13++;
                        } else {
                            i14++;
                        }
                        uVar14 = uVar3;
                        uVar10 = null;
                    }
                    c0230i.f5782b = ((Integer.highestOneBit(i13) * 2) - 1) - i13;
                    c0230i.d = 0;
                    c0230i.f5783c = 0;
                    uVar4 = null;
                    c0230i.f5784e = null;
                    c0230i2.f5782b = ((Integer.highestOneBit(i14) * 2) - 1) - i14;
                    c0230i2.d = 0;
                    c0230i2.f5783c = 0;
                    c0230i2.f5784e = null;
                    u uVar20 = null;
                    while (uVar13 != null) {
                        uVar13.f12735q = uVar20;
                        uVar20 = uVar13;
                        uVar13 = uVar13.f12736r;
                    }
                    while (true) {
                        if (uVar20 == null) {
                            uVar5 = uVar20;
                            uVar20 = null;
                        } else {
                            u uVar21 = uVar20.f12735q;
                            uVar20.f12735q = null;
                            u uVar22 = uVar20.f12737s;
                            while (true) {
                                u uVar23 = uVar22;
                                uVar5 = uVar21;
                                uVar21 = uVar23;
                                if (uVar21 == null) {
                                    break;
                                }
                                uVar21.f12735q = uVar5;
                                uVar22 = uVar21.f12736r;
                            }
                        }
                        if (uVar20 == null) {
                            break;
                        }
                        if ((uVar20.f12741w & length2) == 0) {
                            c0230i.a(uVar20);
                        } else {
                            c0230i2.a(uVar20);
                        }
                        uVar20 = uVar5;
                    }
                    if (i13 > 0) {
                        uVar6 = (u) c0230i.f5784e;
                        if (uVar6.f12735q != null) {
                            throw new IllegalStateException();
                        }
                    } else {
                        uVar6 = null;
                    }
                    uVarArr3[i12] = uVar6;
                    int i15 = i12 + length2;
                    if (i14 > 0) {
                        uVar7 = (u) c0230i2.f5784e;
                        if (uVar7.f12735q != null) {
                            throw new IllegalStateException();
                        }
                    } else {
                        uVar7 = null;
                    }
                    uVarArr3[i15] = uVar7;
                }
                i12++;
                uVar10 = uVar4;
            }
            this.f12746r = uVarArr3;
            this.f12750v = (i11 / 4) + (i11 / 2);
        }
        this.f12749u++;
        return uVar2;
    }

    public final void b(u uVar, boolean z7) {
        int i7;
        int i8;
        int i9;
        int i10;
        while (uVar != null) {
            u uVar2 = uVar.f12736r;
            u uVar3 = uVar.f12737s;
            int i11 = 0;
            if (uVar2 != null) {
                i7 = uVar2.f12743y;
            } else {
                i7 = 0;
            }
            if (uVar3 != null) {
                i8 = uVar3.f12743y;
            } else {
                i8 = 0;
            }
            int i12 = i7 - i8;
            if (i12 == -2) {
                u uVar4 = uVar3.f12736r;
                u uVar5 = uVar3.f12737s;
                if (uVar5 != null) {
                    i10 = uVar5.f12743y;
                } else {
                    i10 = 0;
                }
                if (uVar4 != null) {
                    i11 = uVar4.f12743y;
                }
                int i13 = i11 - i10;
                if (i13 != -1 && (i13 != 0 || z7)) {
                    f(uVar3);
                }
                e(uVar);
                if (z7) {
                    return;
                }
            } else if (i12 == 2) {
                u uVar6 = uVar2.f12736r;
                u uVar7 = uVar2.f12737s;
                if (uVar7 != null) {
                    i9 = uVar7.f12743y;
                } else {
                    i9 = 0;
                }
                if (uVar6 != null) {
                    i11 = uVar6.f12743y;
                }
                int i14 = i11 - i9;
                if (i14 != 1 && (i14 != 0 || z7)) {
                    e(uVar2);
                }
                f(uVar);
                if (z7) {
                    return;
                }
            } else if (i12 == 0) {
                uVar.f12743y = i7 + 1;
                if (z7) {
                    return;
                }
            } else {
                uVar.f12743y = Math.max(i7, i8) + 1;
                if (!z7) {
                    return;
                }
            }
            uVar = uVar.f12735q;
        }
    }

    public final void c(u uVar, boolean z7) {
        u uVar2;
        u uVar3;
        int i7;
        if (z7) {
            u uVar4 = uVar.f12739u;
            uVar4.f12738t = uVar.f12738t;
            uVar.f12738t.f12739u = uVar4;
            uVar.f12739u = null;
            uVar.f12738t = null;
        }
        u uVar5 = uVar.f12736r;
        u uVar6 = uVar.f12737s;
        u uVar7 = uVar.f12735q;
        int i8 = 0;
        if (uVar5 != null && uVar6 != null) {
            if (uVar5.f12743y > uVar6.f12743y) {
                do {
                    uVar3 = uVar5;
                    uVar5 = uVar5.f12737s;
                } while (uVar5 != null);
            } else {
                do {
                    uVar2 = uVar6;
                    uVar6 = uVar6.f12736r;
                } while (uVar6 != null);
                uVar3 = uVar2;
            }
            c(uVar3, false);
            u uVar8 = uVar.f12736r;
            if (uVar8 != null) {
                i7 = uVar8.f12743y;
                uVar3.f12736r = uVar8;
                uVar8.f12735q = uVar3;
                uVar.f12736r = null;
            } else {
                i7 = 0;
            }
            u uVar9 = uVar.f12737s;
            if (uVar9 != null) {
                i8 = uVar9.f12743y;
                uVar3.f12737s = uVar9;
                uVar9.f12735q = uVar3;
                uVar.f12737s = null;
            }
            uVar3.f12743y = Math.max(i7, i8) + 1;
            d(uVar, uVar3);
            return;
        }
        if (uVar5 != null) {
            d(uVar, uVar5);
            uVar.f12736r = null;
        } else if (uVar6 != null) {
            d(uVar, uVar6);
            uVar.f12737s = null;
        } else {
            d(uVar, null);
        }
        b(uVar7, false);
        this.f12748t--;
        this.f12749u++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        Arrays.fill(this.f12746r, (Object) null);
        this.f12748t = 0;
        this.f12749u++;
        u uVar = this.f12747s;
        u uVar2 = uVar.f12738t;
        while (uVar2 != uVar) {
            u uVar3 = uVar2.f12738t;
            uVar2.f12739u = null;
            uVar2.f12738t = null;
            uVar2 = uVar3;
        }
        uVar.f12739u = uVar;
        uVar.f12738t = uVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        u uVar = null;
        if (obj != null) {
            try {
                uVar = a(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        if (uVar == null) {
            return false;
        }
        return true;
    }

    public final void d(u uVar, u uVar2) {
        u uVar3 = uVar.f12735q;
        uVar.f12735q = null;
        if (uVar2 != null) {
            uVar2.f12735q = uVar3;
        }
        if (uVar3 != null) {
            if (uVar3.f12736r == uVar) {
                uVar3.f12736r = uVar2;
                return;
            } else {
                uVar3.f12737s = uVar2;
                return;
            }
        }
        u[] uVarArr = this.f12746r;
        uVarArr[uVar.f12741w & (uVarArr.length - 1)] = uVar2;
    }

    public final void e(u uVar) {
        int i7;
        int i8;
        u uVar2 = uVar.f12736r;
        u uVar3 = uVar.f12737s;
        u uVar4 = uVar3.f12736r;
        u uVar5 = uVar3.f12737s;
        uVar.f12737s = uVar4;
        if (uVar4 != null) {
            uVar4.f12735q = uVar;
        }
        d(uVar, uVar3);
        uVar3.f12736r = uVar;
        uVar.f12735q = uVar3;
        int i9 = 0;
        if (uVar2 != null) {
            i7 = uVar2.f12743y;
        } else {
            i7 = 0;
        }
        if (uVar4 != null) {
            i8 = uVar4.f12743y;
        } else {
            i8 = 0;
        }
        int max = Math.max(i7, i8) + 1;
        uVar.f12743y = max;
        if (uVar5 != null) {
            i9 = uVar5.f12743y;
        }
        uVar3.f12743y = Math.max(max, i9) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        t tVar = this.f12751w;
        if (tVar == null) {
            t tVar2 = new t(this, 0);
            this.f12751w = tVar2;
            return tVar2;
        }
        return tVar;
    }

    public final void f(u uVar) {
        int i7;
        int i8;
        u uVar2 = uVar.f12736r;
        u uVar3 = uVar.f12737s;
        u uVar4 = uVar2.f12736r;
        u uVar5 = uVar2.f12737s;
        uVar.f12736r = uVar5;
        if (uVar5 != null) {
            uVar5.f12735q = uVar;
        }
        d(uVar, uVar2);
        uVar2.f12737s = uVar;
        uVar.f12735q = uVar2;
        int i9 = 0;
        if (uVar3 != null) {
            i7 = uVar3.f12743y;
        } else {
            i7 = 0;
        }
        if (uVar5 != null) {
            i8 = uVar5.f12743y;
        } else {
            i8 = 0;
        }
        int max = Math.max(i7, i8) + 1;
        uVar.f12743y = max;
        if (uVar4 != null) {
            i9 = uVar4.f12743y;
        }
        uVar2.f12743y = Math.max(max, i9) + 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x000c  */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object get(java.lang.Object r3) {
        /*
            r2 = this;
            r0 = 0
            if (r3 == 0) goto L9
            r1 = 0
            n5.u r3 = r2.a(r3, r1)     // Catch: java.lang.ClassCastException -> L9
            goto La
        L9:
            r3 = r0
        La:
            if (r3 == 0) goto Le
            java.lang.Object r0 = r3.f12742x
        Le:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: n5.v.get(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        t tVar = this.f12752x;
        if (tVar == null) {
            t tVar2 = new t(this, 1);
            this.f12752x = tVar2;
            return tVar2;
        }
        return tVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        if (obj != null) {
            u a7 = a(obj, true);
            Object obj3 = a7.f12742x;
            a7.f12742x = obj2;
            return obj3;
        }
        throw new NullPointerException("key == null");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0012  */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x000c  */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object remove(java.lang.Object r3) {
        /*
            r2 = this;
            r0 = 0
            if (r3 == 0) goto L9
            r1 = 0
            n5.u r3 = r2.a(r3, r1)     // Catch: java.lang.ClassCastException -> L9
            goto La
        L9:
            r3 = r0
        La:
            if (r3 == 0) goto L10
            r1 = 1
            r2.c(r3, r1)
        L10:
            if (r3 == 0) goto L14
            java.lang.Object r0 = r3.f12742x
        L14:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: n5.v.remove(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f12748t;
    }
}
