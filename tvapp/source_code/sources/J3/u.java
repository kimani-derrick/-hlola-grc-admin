package J3;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;
/* loaded from: classes.dex */
public final class u {

    /* renamed from: a  reason: collision with root package name */
    public float f1418a;

    /* renamed from: b  reason: collision with root package name */
    public float f1419b;

    /* renamed from: c  reason: collision with root package name */
    public float f1420c;
    public float d;

    /* renamed from: e  reason: collision with root package name */
    public float f1421e;
    public float f;

    /* renamed from: g  reason: collision with root package name */
    public final ArrayList f1422g = new ArrayList();

    /* renamed from: h  reason: collision with root package name */
    public final ArrayList f1423h = new ArrayList();

    public u() {
        d(0.0f, 270.0f, 0.0f);
    }

    public final void a(float f) {
        float f7 = this.f1421e;
        if (f7 == f) {
            return;
        }
        float f8 = ((f - f7) + 360.0f) % 360.0f;
        if (f8 > 180.0f) {
            return;
        }
        float f9 = this.f1420c;
        float f10 = this.d;
        q qVar = new q(f9, f10, f9, f10);
        qVar.f = this.f1421e;
        qVar.f1413g = f8;
        this.f1423h.add(new o(qVar));
        this.f1421e = f;
    }

    public final void b(Matrix matrix, Path path) {
        ArrayList arrayList = this.f1422g;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            ((s) arrayList.get(i7)).a(matrix, path);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, J3.s, J3.r] */
    public final void c(float f, float f7) {
        ?? sVar = new s();
        sVar.f1414b = f;
        sVar.f1415c = f7;
        this.f1422g.add(sVar);
        p pVar = new p(sVar, this.f1420c, this.d);
        a(pVar.b() + 270.0f);
        this.f1423h.add(pVar);
        this.f1421e = pVar.b() + 270.0f;
        this.f1420c = f;
        this.d = f7;
    }

    public final void d(float f, float f7, float f8) {
        this.f1418a = 0.0f;
        this.f1419b = f;
        this.f1420c = 0.0f;
        this.d = f;
        this.f1421e = f7;
        this.f = (f7 + f8) % 360.0f;
        this.f1422g.clear();
        this.f1423h.clear();
    }
}
