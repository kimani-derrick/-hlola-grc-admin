package J3;

import H2.AbstractC0000a;
import H2.B;
import H2.C0019u;
import H2.InterfaceC0022x;
import H2.g0;
import Y2.W;
import Z2.H;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Looper;
import androidx.fragment.app.D;
import e2.C0591H;
import e2.C0615k0;
import e2.C0617l0;
import e2.J0;
import e2.z0;
import e5.C0657b;
import e5.C0658c;
import f5.C0700a;
import f5.C0701b;
import i5.C0775a;
import j5.C0841a;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import l5.C0980d;
import w0.U;
import w0.a0;
/* loaded from: classes.dex */
public final class m {

    /* renamed from: a  reason: collision with root package name */
    public boolean f1394a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f1395b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f1396c;
    public final Object d;

    /* renamed from: e  reason: collision with root package name */
    public final Object f1397e;
    public final Object f;

    /* renamed from: g  reason: collision with root package name */
    public final Object f1398g;

    /* renamed from: h  reason: collision with root package name */
    public final Object f1399h;

    /* renamed from: i  reason: collision with root package name */
    public Object f1400i;

    /* renamed from: j  reason: collision with root package name */
    public final Object f1401j;

    /* renamed from: k  reason: collision with root package name */
    public Object f1402k;

    /* renamed from: l  reason: collision with root package name */
    public Object f1403l;

    public m() {
        this.f1395b = new u[4];
        this.f1396c = new Matrix[4];
        this.d = new Matrix[4];
        this.f1397e = new PointF();
        this.f = new Path();
        this.f1398g = new Path();
        this.f1401j = new u();
        this.f1402k = new float[2];
        this.f1403l = new float[2];
        this.f1399h = new Path();
        this.f1400i = new Path();
        this.f1394a = true;
        for (int i7 = 0; i7 < 4; i7++) {
            ((u[]) this.f1395b)[i7] = new u();
            ((Matrix[]) this.f1396c)[i7] = new Matrix();
            ((Matrix[]) this.d)[i7] = new Matrix();
        }
    }

    public J0 a(int i7, List list, g0 g0Var) {
        if (!list.isEmpty()) {
            this.f1402k = g0Var;
            for (int i8 = i7; i8 < list.size() + i7; i8++) {
                C0617l0 c0617l0 = (C0617l0) list.get(i8 - i7);
                ArrayList arrayList = (ArrayList) this.f1396c;
                if (i8 > 0) {
                    C0617l0 c0617l02 = (C0617l0) arrayList.get(i8 - 1);
                    c0617l0.d = c0617l02.f10011a.f1170o.f1149r.p() + c0617l02.d;
                } else {
                    c0617l0.d = 0;
                }
                c0617l0.f10014e = false;
                c0617l0.f10013c.clear();
                int p3 = c0617l0.f10011a.f1170o.f1149r.p();
                for (int i9 = i8; i9 < arrayList.size(); i9++) {
                    ((C0617l0) arrayList.get(i9)).d += p3;
                }
                arrayList.add(i8, c0617l0);
                ((HashMap) this.f1397e).put(c0617l0.f10012b, c0617l0);
                if (this.f1394a) {
                    g(c0617l0);
                    if (((IdentityHashMap) this.d).isEmpty()) {
                        ((HashSet) this.f1399h).add(c0617l0);
                    } else {
                        C0615k0 c0615k0 = (C0615k0) ((HashMap) this.f1398g).get(c0617l0);
                        if (c0615k0 != null) {
                            c0615k0.f10001a.b(c0615k0.f10002b);
                        }
                    }
                }
            }
        }
        return c();
    }

    public void b(k kVar, float f, RectF rectF, T4.c cVar, Path path) {
        int i7;
        Matrix[] matrixArr;
        float[] fArr;
        Matrix[] matrixArr2;
        u[] uVarArr;
        float centerX;
        float f7;
        e eVar;
        c cVar2;
        m3.g gVar;
        int i8;
        float f8;
        float f9;
        m mVar = this;
        path.rewind();
        Path path2 = (Path) mVar.f;
        path2.rewind();
        Path path3 = (Path) mVar.f1398g;
        path3.rewind();
        path3.addRect(rectF, Path.Direction.CW);
        int i9 = 0;
        while (true) {
            i7 = 4;
            matrixArr = (Matrix[]) mVar.d;
            fArr = (float[]) mVar.f1402k;
            matrixArr2 = (Matrix[]) mVar.f1396c;
            uVarArr = (u[]) mVar.f1395b;
            if (i9 >= 4) {
                break;
            }
            if (i9 != 1) {
                if (i9 != 2) {
                    if (i9 != 3) {
                        cVar2 = kVar.f;
                    } else {
                        cVar2 = kVar.f1386e;
                    }
                } else {
                    cVar2 = kVar.f1388h;
                }
            } else {
                cVar2 = kVar.f1387g;
            }
            if (i9 != 1) {
                if (i9 != 2) {
                    if (i9 != 3) {
                        gVar = kVar.f1384b;
                    } else {
                        gVar = kVar.f1383a;
                    }
                } else {
                    gVar = kVar.d;
                }
            } else {
                gVar = kVar.f1385c;
            }
            u uVar = uVarArr[i9];
            gVar.getClass();
            gVar.r(uVar, f, cVar2.a(rectF));
            int i10 = i9 + 1;
            float f10 = i10 * 90;
            matrixArr2[i9].reset();
            PointF pointF = (PointF) mVar.f1397e;
            if (i9 != 1) {
                if (i9 != 2) {
                    if (i9 != 3) {
                        f8 = rectF.right;
                        i8 = i10;
                    } else {
                        i8 = i10;
                        f8 = rectF.left;
                    }
                    f9 = rectF.top;
                    pointF.set(f8, f9);
                    matrixArr2[i9].setTranslate(pointF.x, pointF.y);
                    matrixArr2[i9].preRotate(f10);
                    u uVar2 = uVarArr[i9];
                    fArr[0] = uVar2.f1420c;
                    fArr[1] = uVar2.d;
                    matrixArr2[i9].mapPoints(fArr);
                    matrixArr[i9].reset();
                    matrixArr[i9].setTranslate(fArr[0], fArr[1]);
                    matrixArr[i9].preRotate(f10);
                    i9 = i8;
                } else {
                    i8 = i10;
                    f8 = rectF.left;
                }
            } else {
                i8 = i10;
                f8 = rectF.right;
            }
            f9 = rectF.bottom;
            pointF.set(f8, f9);
            matrixArr2[i9].setTranslate(pointF.x, pointF.y);
            matrixArr2[i9].preRotate(f10);
            u uVar22 = uVarArr[i9];
            fArr[0] = uVar22.f1420c;
            fArr[1] = uVar22.d;
            matrixArr2[i9].mapPoints(fArr);
            matrixArr[i9].reset();
            matrixArr[i9].setTranslate(fArr[0], fArr[1]);
            matrixArr[i9].preRotate(f10);
            i9 = i8;
        }
        int i11 = 0;
        while (i11 < i7) {
            u uVar3 = uVarArr[i11];
            fArr[0] = uVar3.f1418a;
            fArr[1] = uVar3.f1419b;
            matrixArr2[i11].mapPoints(fArr);
            if (i11 == 0) {
                path.moveTo(fArr[0], fArr[1]);
            } else {
                path.lineTo(fArr[0], fArr[1]);
            }
            uVarArr[i11].b(matrixArr2[i11], path);
            if (cVar != null) {
                u uVar4 = uVarArr[i11];
                Matrix matrix = matrixArr2[i11];
                g gVar2 = (g) cVar.f3382r;
                BitSet bitSet = gVar2.f1365t;
                uVar4.getClass();
                bitSet.set(i11, false);
                uVar4.a(uVar4.f);
                gVar2.f1363r[i11] = new n(new ArrayList(uVar4.f1423h), new Matrix(matrix));
            }
            int i12 = i11 + 1;
            int i13 = i12 % 4;
            u uVar5 = uVarArr[i11];
            fArr[0] = uVar5.f1420c;
            fArr[1] = uVar5.d;
            matrixArr2[i11].mapPoints(fArr);
            u uVar6 = uVarArr[i13];
            float f11 = uVar6.f1418a;
            float[] fArr2 = (float[]) mVar.f1403l;
            fArr2[0] = f11;
            fArr2[1] = uVar6.f1419b;
            matrixArr2[i13].mapPoints(fArr2);
            float max = Math.max(((float) Math.hypot(fArr[0] - fArr2[0], fArr[1] - fArr2[1])) - 0.001f, 0.0f);
            u uVar7 = uVarArr[i11];
            fArr[0] = uVar7.f1420c;
            fArr[1] = uVar7.d;
            matrixArr2[i11].mapPoints(fArr);
            if (i11 != 1 && i11 != 3) {
                centerX = rectF.centerY();
                f7 = fArr[1];
            } else {
                centerX = rectF.centerX();
                f7 = fArr[0];
            }
            Math.abs(centerX - f7);
            u uVar8 = (u) mVar.f1401j;
            uVar8.d(0.0f, 270.0f, 0.0f);
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        eVar = kVar.f1390j;
                    } else {
                        eVar = kVar.f1389i;
                    }
                } else {
                    eVar = kVar.f1392l;
                }
            } else {
                eVar = kVar.f1391k;
            }
            eVar.getClass();
            uVar8.c(max, 0.0f);
            Path path4 = (Path) mVar.f1399h;
            path4.reset();
            uVar8.b(matrixArr[i11], path4);
            if (mVar.f1394a && (mVar.f(path4, i11) || mVar.f(path4, i13))) {
                path4.op(path4, path3, Path.Op.DIFFERENCE);
                fArr[0] = uVar8.f1418a;
                fArr[1] = uVar8.f1419b;
                matrixArr[i11].mapPoints(fArr);
                path2.moveTo(fArr[0], fArr[1]);
                uVar8.b(matrixArr[i11], path2);
            } else {
                uVar8.b(matrixArr[i11], path);
            }
            if (cVar != null) {
                Matrix matrix2 = matrixArr[i11];
                g gVar3 = (g) cVar.f3382r;
                gVar3.f1365t.set(i11 + 4, false);
                uVar8.a(uVar8.f);
                gVar3.f1364s[i11] = new n(new ArrayList(uVar8.f1423h), new Matrix(matrix2));
            }
            i7 = 4;
            mVar = this;
            i11 = i12;
        }
        path.close();
        path2.close();
        if (!path2.isEmpty()) {
            path.op(path2, Path.Op.UNION);
        }
    }

    public J0 c() {
        ArrayList arrayList = (ArrayList) this.f1396c;
        if (arrayList.isEmpty()) {
            return J0.f9620q;
        }
        int i7 = 0;
        for (int i8 = 0; i8 < arrayList.size(); i8++) {
            C0617l0 c0617l0 = (C0617l0) arrayList.get(i8);
            c0617l0.d = i7;
            i7 += c0617l0.f10011a.f1170o.f1149r.p();
        }
        return new z0(arrayList, (g0) this.f1402k);
    }

    public void d() {
        Iterator it = ((HashSet) this.f1399h).iterator();
        while (it.hasNext()) {
            C0617l0 c0617l0 = (C0617l0) it.next();
            if (c0617l0.f10013c.isEmpty()) {
                C0615k0 c0615k0 = (C0615k0) ((HashMap) this.f1398g).get(c0617l0);
                if (c0615k0 != null) {
                    c0615k0.f10001a.b(c0615k0.f10002b);
                }
                it.remove();
            }
        }
    }

    public void e(C0617l0 c0617l0) {
        if (c0617l0.f10014e && c0617l0.f10013c.isEmpty()) {
            C0615k0 c0615k0 = (C0615k0) ((HashMap) this.f1398g).remove(c0617l0);
            c0615k0.getClass();
            AbstractC0000a abstractC0000a = c0615k0.f10001a;
            abstractC0000a.n(c0615k0.f10002b);
            D d = c0615k0.f10003c;
            abstractC0000a.q(d);
            abstractC0000a.p(d);
            ((HashSet) this.f1399h).remove(c0617l0);
        }
    }

    public boolean f(Path path, int i7) {
        Path path2 = (Path) this.f1400i;
        path2.reset();
        ((u[]) this.f1395b)[i7].b(((Matrix[]) this.f1396c)[i7], path2);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        path2.computeBounds(rectF, true);
        path.op(path2, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        if (!rectF.isEmpty()) {
            return true;
        }
        if (rectF.width() > 1.0f && rectF.height() > 1.0f) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [e2.g0, H2.B] */
    /* JADX WARN: Type inference failed for: r4v2, types: [j2.m, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [H2.G, java.lang.Object] */
    public void g(C0617l0 c0617l0) {
        C0019u c0019u = c0617l0.f10011a;
        ?? r12 = new B() { // from class: e2.g0
            @Override // H2.B
            public final void a(AbstractC0000a abstractC0000a, J0 j02) {
                ((C0591H) J3.m.this.f).f9544x.d(22);
            }
        };
        D d = new D(this, 8, c0617l0);
        ((HashMap) this.f1398g).put(c0617l0, new C0615k0(c0019u, r12, d));
        int i7 = H.f4603a;
        Looper myLooper = Looper.myLooper();
        if (myLooper == null) {
            myLooper = Looper.getMainLooper();
        }
        Handler handler = new Handler(myLooper, null);
        C.d dVar = c0019u.f1011c;
        dVar.getClass();
        ?? obj = new Object();
        obj.f900a = handler;
        obj.f901b = d;
        ((CopyOnWriteArrayList) dVar.f326t).add(obj);
        Looper myLooper2 = Looper.myLooper();
        if (myLooper2 == null) {
            myLooper2 = Looper.getMainLooper();
        }
        Handler handler2 = new Handler(myLooper2, null);
        j2.n nVar = c0019u.d;
        nVar.getClass();
        ?? obj2 = new Object();
        obj2.f11831a = handler2;
        obj2.f11832b = d;
        nVar.f11835c.add(obj2);
        c0019u.j(r12, (W) this.f1403l, (f2.m) this.f1395b);
    }

    public void h(InterfaceC0022x interfaceC0022x) {
        IdentityHashMap identityHashMap = (IdentityHashMap) this.d;
        C0617l0 c0617l0 = (C0617l0) identityHashMap.remove(interfaceC0022x);
        c0617l0.getClass();
        c0617l0.f10011a.m(interfaceC0022x);
        c0617l0.f10013c.remove(((H2.r) interfaceC0022x).f1157q);
        if (!identityHashMap.isEmpty()) {
            d();
        }
        e(c0617l0);
    }

    public void i(int i7, int i8) {
        for (int i9 = i8 - 1; i9 >= i7; i9--) {
            ArrayList arrayList = (ArrayList) this.f1396c;
            C0617l0 c0617l0 = (C0617l0) arrayList.remove(i9);
            ((HashMap) this.f1397e).remove(c0617l0.f10012b);
            int i10 = -c0617l0.f10011a.f1170o.f1149r.p();
            for (int i11 = i9; i11 < arrayList.size(); i11++) {
                ((C0617l0) arrayList.get(i11)).d += i10;
            }
            c0617l0.f10014e = true;
            if (this.f1394a) {
                e(c0617l0);
            }
        }
    }

    public void j() {
        h5.i iVar = (h5.i) this.f1400i;
        U u7 = iVar.f11050a;
        for (int y3 = u7.y() - 1; y3 >= 0; y3--) {
            u7.f15478a.p(y3);
        }
        iVar.f11055h.a();
    }

    public int k(int i7, a0 a0Var, w0.g0 g0Var) {
        if (g0Var.b() == 0 || i7 == 0 || !((C0657b) this.d).f10162s) {
            return 0;
        }
        C0701b c0701b = (C0701b) ((C0700a) this.f1396c).f;
        int i8 = c0701b.f10435b;
        int i9 = c0701b.f10434a;
        if (i7 > 0) {
            if (!C0701b.d(i8)) {
                if (p6.d.o(i7) == p6.d.o(i8)) {
                    if (i7 > i8) {
                        i7 = i8;
                    }
                }
                i7 = 0;
            }
            ((h5.i) this.f1400i).k(i7, a0Var, g0Var, true);
            return i7;
        }
        if (p6.d.o(i7) == p6.d.o(i9)) {
            if (!C0701b.d(i9) && i7 < i9) {
                i7 = i9;
            }
            ((h5.i) this.f1400i).k(i7, a0Var, g0Var, true);
            return i7;
        }
        i7 = 0;
        ((h5.i) this.f1400i).k(i7, a0Var, g0Var, true);
        return i7;
    }

    public m(C0591H c0591h, f2.f fVar, Z2.D d, f2.m mVar) {
        this.f1395b = mVar;
        this.f = c0591h;
        this.f1402k = new g0();
        this.d = new IdentityHashMap();
        this.f1397e = new HashMap();
        this.f1396c = new ArrayList();
        this.f1400i = fVar;
        this.f1401j = d;
        this.f1398g = new HashMap();
        this.f1399h = new HashSet();
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [h5.a, java.lang.Object] */
    public m(U u7, C0700a c0700a, C0657b c0657b, C0658c c0658c, C0980d c0980d, h5.d dVar) {
        M5.g.f(u7, "layoutManager");
        this.f1395b = u7;
        this.f1396c = c0700a;
        this.d = c0657b;
        this.f1397e = c0658c;
        this.f = c0980d;
        this.f1398g = dVar;
        Z5.n nVar = new Z5.n(this);
        this.f1399h = nVar;
        this.f1400i = c0657b.f10148b > 1 ? new C0775a(u7, dVar, c0700a, nVar) : new C0841a(u7, dVar, c0700a, nVar);
        this.f1401j = new ArrayList();
        ?? obj = new Object();
        obj.f11005a = -1;
        obj.f11007c = -1;
        obj.f11008e = -1;
        obj.f = -1;
        this.f1402k = obj;
    }
}
