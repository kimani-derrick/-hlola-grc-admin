package O2;

import Z2.AbstractC0156a;
import Z2.H;
import Z2.y;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
/* loaded from: classes.dex */
public final class a extends M2.g {

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ int f2548m;
    public final Object n;

    public a() {
        this.f2548m = 1;
        this.n = new y();
    }

    /* JADX WARN: Type inference failed for: r2v21, types: [java.lang.Object, O2.e] */
    @Override // M2.g
    public final M2.h f(int i7, boolean z7, byte[] bArr) {
        N2.j jVar;
        i iVar;
        int i8;
        List unmodifiableList;
        N2.j jVar2;
        char c5;
        int i9;
        c cVar;
        ArrayList arrayList;
        int i10;
        i iVar2;
        Paint paint;
        int[] iArr;
        g gVar;
        SparseArray sparseArray;
        b bVar;
        int i11;
        b bVar2;
        d dVar;
        int i12;
        int i13;
        int i14;
        int i15;
        M2.b a7;
        int i16 = 2;
        Object obj = this.n;
        int i17 = 1;
        int i18 = 8;
        switch (this.f2548m) {
            case 0:
                j jVar3 = (j) obj;
                if (z7) {
                    i iVar3 = jVar3.f;
                    iVar3.f2576c.clear();
                    iVar3.d.clear();
                    iVar3.f2577e.clear();
                    iVar3.f.clear();
                    iVar3.f2578g.clear();
                    iVar3.f2579h = null;
                    iVar3.f2580i = null;
                }
                jVar3.getClass();
                N2.f fVar = new N2.f(i7, bArr);
                while (true) {
                    int b7 = fVar.b();
                    iVar = jVar3.f;
                    if (b7 >= 48 && fVar.i(i18) == 15) {
                        int i19 = fVar.i(i18);
                        int i20 = 16;
                        int i21 = fVar.i(16);
                        int i22 = fVar.i(16);
                        int f = fVar.f() + i22;
                        if (i22 * 8 > fVar.b()) {
                            AbstractC0156a.K("DvbParser", "Data field length exceeds limit");
                            fVar.s(fVar.b());
                        } else {
                            int i23 = 4;
                            switch (i19) {
                                case 16:
                                    if (i21 == iVar.f2574a) {
                                        e eVar = iVar.f2580i;
                                        int i24 = 8;
                                        fVar.i(8);
                                        int i25 = fVar.i(4);
                                        int i26 = fVar.i(2);
                                        fVar.s(2);
                                        int i27 = i22 - 2;
                                        SparseArray sparseArray2 = new SparseArray();
                                        while (i27 > 0) {
                                            int i28 = fVar.i(i24);
                                            fVar.s(i24);
                                            i27 -= 6;
                                            sparseArray2.put(i28, new f(fVar.i(16), fVar.i(16)));
                                            i24 = 8;
                                        }
                                        ?? obj2 = new Object();
                                        obj2.f2559a = i25;
                                        obj2.f2560b = i26;
                                        obj2.f2561c = sparseArray2;
                                        if (i26 != 0) {
                                            iVar.f2580i = obj2;
                                            iVar.f2576c.clear();
                                            iVar.d.clear();
                                            iVar.f2577e.clear();
                                            break;
                                        } else if (eVar != null && eVar.f2559a != i25) {
                                            iVar.f2580i = obj2;
                                            break;
                                        }
                                    }
                                    break;
                                case 17:
                                    e eVar2 = iVar.f2580i;
                                    if (i21 == iVar.f2574a && eVar2 != null) {
                                        int i29 = fVar.i(i18);
                                        fVar.s(4);
                                        boolean h7 = fVar.h();
                                        fVar.s(3);
                                        int i30 = fVar.i(16);
                                        int i31 = fVar.i(16);
                                        fVar.i(3);
                                        int i32 = fVar.i(3);
                                        fVar.s(i16);
                                        int i33 = fVar.i(i18);
                                        int i34 = fVar.i(i18);
                                        int i35 = fVar.i(4);
                                        int i36 = fVar.i(i16);
                                        fVar.s(i16);
                                        int i37 = i22 - 10;
                                        SparseArray sparseArray3 = new SparseArray();
                                        while (i37 > 0) {
                                            int i38 = fVar.i(i20);
                                            int i39 = fVar.i(i16);
                                            fVar.i(i16);
                                            int i40 = fVar.i(12);
                                            fVar.s(i23);
                                            int i41 = fVar.i(12);
                                            int i42 = i37 - 6;
                                            if (i39 != 1 && i39 != 2) {
                                                i37 = i42;
                                            } else {
                                                fVar.i(8);
                                                fVar.i(8);
                                                i37 -= 8;
                                            }
                                            sparseArray3.put(i38, new h(i40, i41));
                                            i20 = 16;
                                            i16 = 2;
                                            i23 = 4;
                                        }
                                        g gVar2 = new g(i29, h7, i30, i31, i32, i33, i34, i35, i36, sparseArray3);
                                        SparseArray sparseArray4 = iVar.f2576c;
                                        if (eVar2.f2560b == 0 && (gVar = (g) sparseArray4.get(i29)) != null) {
                                            int i43 = 0;
                                            while (true) {
                                                SparseArray sparseArray5 = gVar.f2571j;
                                                if (i43 < sparseArray5.size()) {
                                                    gVar2.f2571j.put(sparseArray5.keyAt(i43), (h) sparseArray5.valueAt(i43));
                                                    i43++;
                                                }
                                            }
                                        }
                                        sparseArray4.put(gVar2.f2564a, gVar2);
                                        break;
                                    }
                                    break;
                                case 18:
                                    if (i21 == iVar.f2574a) {
                                        b f7 = j.f(fVar, i22);
                                        sparseArray = iVar.d;
                                        bVar = f7;
                                    } else if (i21 == iVar.f2575b) {
                                        b f8 = j.f(fVar, i22);
                                        sparseArray = iVar.f;
                                        bVar = f8;
                                    }
                                    i11 = bVar.f2549a;
                                    bVar2 = bVar;
                                    sparseArray.put(i11, bVar2);
                                    break;
                                case 19:
                                    if (i21 == iVar.f2574a) {
                                        d g7 = j.g(fVar);
                                        sparseArray = iVar.f2577e;
                                        dVar = g7;
                                    } else if (i21 == iVar.f2575b) {
                                        d g8 = j.g(fVar);
                                        sparseArray = iVar.f2578g;
                                        dVar = g8;
                                    }
                                    i11 = dVar.f2556a;
                                    bVar2 = dVar;
                                    sparseArray.put(i11, bVar2);
                                    break;
                                case 20:
                                    if (i21 == iVar.f2574a) {
                                        fVar.s(4);
                                        boolean h8 = fVar.h();
                                        fVar.s(3);
                                        int i44 = fVar.i(16);
                                        int i45 = fVar.i(16);
                                        if (h8) {
                                            int i46 = fVar.i(16);
                                            int i47 = fVar.i(16);
                                            int i48 = fVar.i(16);
                                            i12 = i47;
                                            i13 = fVar.i(16);
                                            i15 = i48;
                                            i14 = i46;
                                        } else {
                                            i12 = i44;
                                            i13 = i45;
                                            i14 = 0;
                                            i15 = 0;
                                        }
                                        iVar.f2579h = new c(i44, i45, i14, i12, i15, i13);
                                        break;
                                    }
                                    break;
                            }
                            fVar.t(f - fVar.f());
                        }
                        i16 = 2;
                        i18 = 8;
                    }
                }
                e eVar3 = iVar.f2580i;
                if (eVar3 == null) {
                    unmodifiableList = Collections.emptyList();
                    i8 = 1;
                    jVar2 = jVar;
                } else {
                    c cVar2 = iVar.f2579h;
                    if (cVar2 == null) {
                        cVar2 = jVar3.d;
                    }
                    Bitmap bitmap = jVar3.f2588g;
                    Canvas canvas = jVar3.f2586c;
                    if (bitmap == null || cVar2.f2552a + 1 != bitmap.getWidth() || cVar2.f2553b + 1 != jVar3.f2588g.getHeight()) {
                        Bitmap createBitmap = Bitmap.createBitmap(cVar2.f2552a + 1, cVar2.f2553b + 1, Bitmap.Config.ARGB_8888);
                        jVar3.f2588g = createBitmap;
                        canvas.setBitmap(createBitmap);
                    }
                    ArrayList arrayList2 = new ArrayList();
                    int i49 = 0;
                    while (true) {
                        SparseArray sparseArray6 = (SparseArray) eVar3.f2561c;
                        if (i49 < sparseArray6.size()) {
                            canvas.save();
                            f fVar2 = (f) sparseArray6.valueAt(i49);
                            g gVar3 = (g) iVar.f2576c.get(sparseArray6.keyAt(i49));
                            int i50 = fVar2.f2562a + cVar2.f2554c;
                            int i51 = fVar2.f2563b + cVar2.f2555e;
                            int min = Math.min(gVar3.f2566c + i50, cVar2.d);
                            int i52 = gVar3.d;
                            int i53 = i51 + i52;
                            canvas.clipRect(i50, i51, min, Math.min(i53, cVar2.f));
                            SparseArray sparseArray7 = iVar.d;
                            int i54 = gVar3.f;
                            b bVar3 = (b) sparseArray7.get(i54);
                            if (bVar3 == null && (bVar3 = (b) iVar.f.get(i54)) == null) {
                                bVar3 = jVar3.f2587e;
                            }
                            int i55 = 0;
                            while (true) {
                                SparseArray sparseArray8 = gVar3.f2571j;
                                e eVar4 = eVar3;
                                if (i55 < sparseArray8.size()) {
                                    int keyAt = sparseArray8.keyAt(i55);
                                    h hVar = (h) sparseArray8.valueAt(i55);
                                    N2.j jVar4 = jVar;
                                    d dVar2 = (d) iVar.f2577e.get(keyAt);
                                    if (dVar2 == null) {
                                        dVar2 = (d) iVar.f2578g.get(keyAt);
                                    }
                                    if (dVar2 != null) {
                                        if (dVar2.f2557b) {
                                            iVar2 = iVar;
                                            paint = null;
                                        } else {
                                            paint = jVar3.f2584a;
                                            iVar2 = iVar;
                                        }
                                        int i56 = hVar.f2572a + i50;
                                        int i57 = hVar.f2573b + i51;
                                        i10 = i49;
                                        int i58 = gVar3.f2567e;
                                        arrayList = arrayList2;
                                        if (i58 == 3) {
                                            iArr = bVar3.d;
                                        } else if (i58 == 2) {
                                            iArr = bVar3.f2551c;
                                        } else {
                                            iArr = bVar3.f2550b;
                                        }
                                        cVar = cVar2;
                                        int[] iArr2 = iArr;
                                        Paint paint2 = paint;
                                        j.e(dVar2.f2558c, iArr2, i58, i56, i57, paint2, canvas);
                                        j.e(dVar2.d, iArr2, i58, i56, i57 + 1, paint2, canvas);
                                    } else {
                                        cVar = cVar2;
                                        arrayList = arrayList2;
                                        i10 = i49;
                                        iVar2 = iVar;
                                    }
                                    i55++;
                                    arrayList2 = arrayList;
                                    eVar3 = eVar4;
                                    jVar = jVar4;
                                    iVar = iVar2;
                                    i49 = i10;
                                    cVar2 = cVar;
                                } else {
                                    c cVar3 = cVar2;
                                    ArrayList arrayList3 = arrayList2;
                                    int i59 = i49;
                                    N2.j jVar5 = jVar;
                                    i iVar4 = iVar;
                                    boolean z8 = gVar3.f2565b;
                                    int i60 = gVar3.f2566c;
                                    if (z8) {
                                        int i61 = gVar3.f2567e;
                                        c5 = 3;
                                        if (i61 == 3) {
                                            i9 = bVar3.d[gVar3.f2568g];
                                        } else if (i61 == 2) {
                                            i9 = bVar3.f2551c[gVar3.f2569h];
                                        } else {
                                            i9 = bVar3.f2550b[gVar3.f2570i];
                                        }
                                        Paint paint3 = jVar3.f2585b;
                                        paint3.setColor(i9);
                                        canvas.drawRect(i50, i51, i50 + i60, i53, paint3);
                                    } else {
                                        c5 = 3;
                                    }
                                    Bitmap createBitmap2 = Bitmap.createBitmap(jVar3.f2588g, i50, i51, i60, i52);
                                    float f9 = cVar3.f2552a;
                                    float f10 = cVar3.f2553b;
                                    arrayList3.add(new M2.b(null, null, null, createBitmap2, i51 / f10, 0, 0, i50 / f9, 0, Integer.MIN_VALUE, -3.4028235E38f, i60 / f9, i52 / f10, false, -16777216, Integer.MIN_VALUE, 0.0f));
                                    canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                                    canvas.restore();
                                    arrayList2 = arrayList3;
                                    cVar2 = cVar3;
                                    i49 = i59 + 1;
                                    eVar3 = eVar4;
                                    jVar = jVar5;
                                    iVar = iVar4;
                                    i17 = 1;
                                }
                            }
                        } else {
                            i8 = i17;
                            unmodifiableList = Collections.unmodifiableList(arrayList2);
                            jVar2 = jVar;
                        }
                    }
                }
                return new N2.j(i8, unmodifiableList);
            default:
                y yVar = (y) obj;
                yVar.D(i7, bArr);
                ArrayList arrayList4 = new ArrayList();
                while (yVar.a() > 0) {
                    if (yVar.a() >= 8) {
                        int g9 = yVar.g();
                        if (yVar.g() == 1987343459) {
                            int i62 = g9 - 8;
                            CharSequence charSequence = null;
                            M2.a aVar = null;
                            while (i62 > 0) {
                                if (i62 >= 8) {
                                    int g10 = yVar.g();
                                    int g11 = yVar.g();
                                    int i63 = g10 - 8;
                                    byte[] bArr2 = yVar.f4691a;
                                    int i64 = yVar.f4692b;
                                    int i65 = H.f4603a;
                                    String str = new String(bArr2, i64, i63, N3.e.f2497c);
                                    yVar.G(i63);
                                    i62 = (i62 - 8) - i63;
                                    if (g11 == 1937011815) {
                                        V2.g gVar4 = new V2.g();
                                        V2.h.e(str, gVar4);
                                        aVar = gVar4.a();
                                    } else if (g11 == 1885436268) {
                                        charSequence = V2.h.f(null, str.trim(), Collections.emptyList());
                                    }
                                } else {
                                    throw new Exception("Incomplete vtt cue box header found.");
                                }
                            }
                            if (charSequence == null) {
                                charSequence = "";
                            }
                            if (aVar != null) {
                                aVar.f2205a = charSequence;
                                a7 = aVar.a();
                            } else {
                                Pattern pattern = V2.h.f3649a;
                                V2.g gVar5 = new V2.g();
                                gVar5.f3642c = charSequence;
                                a7 = gVar5.a().a();
                            }
                            arrayList4.add(a7);
                        } else {
                            yVar.G(g9 - 8);
                        }
                    } else {
                        throw new Exception("Incomplete Mp4Webvtt Top Level box header found.");
                    }
                }
                return new N2.j(arrayList4);
        }
    }

    public a(List list) {
        this.f2548m = 0;
        y yVar = new y((byte[]) list.get(0));
        this.n = new j(yVar.z(), yVar.z());
    }
}
