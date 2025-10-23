package H0;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import o.C1052e;
/* loaded from: classes.dex */
public final class n {

    /* renamed from: p  reason: collision with root package name */
    public static final Matrix f845p = new Matrix();

    /* renamed from: a  reason: collision with root package name */
    public final Path f846a;

    /* renamed from: b  reason: collision with root package name */
    public final Path f847b;

    /* renamed from: c  reason: collision with root package name */
    public final Matrix f848c;
    public Paint d;

    /* renamed from: e  reason: collision with root package name */
    public Paint f849e;
    public PathMeasure f;

    /* renamed from: g  reason: collision with root package name */
    public final k f850g;

    /* renamed from: h  reason: collision with root package name */
    public float f851h;

    /* renamed from: i  reason: collision with root package name */
    public float f852i;

    /* renamed from: j  reason: collision with root package name */
    public float f853j;

    /* renamed from: k  reason: collision with root package name */
    public float f854k;

    /* renamed from: l  reason: collision with root package name */
    public int f855l;

    /* renamed from: m  reason: collision with root package name */
    public String f856m;
    public Boolean n;

    /* renamed from: o  reason: collision with root package name */
    public final C1052e f857o;

    /* JADX WARN: Type inference failed for: r0v4, types: [o.e, o.j] */
    public n() {
        this.f848c = new Matrix();
        this.f851h = 0.0f;
        this.f852i = 0.0f;
        this.f853j = 0.0f;
        this.f854k = 0.0f;
        this.f855l = 255;
        this.f856m = null;
        this.n = null;
        this.f857o = new o.j();
        this.f850g = new k();
        this.f846a = new Path();
        this.f847b = new Path();
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00e6, code lost:
        if (r0.f828k != 1.0f) goto L68;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r11v18 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(H0.k r19, android.graphics.Matrix r20, android.graphics.Canvas r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 558
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: H0.n.a(H0.k, android.graphics.Matrix, android.graphics.Canvas, int, int):void");
    }

    public float getAlpha() {
        return getRootAlpha() / 255.0f;
    }

    public int getRootAlpha() {
        return this.f855l;
    }

    public void setAlpha(float f) {
        setRootAlpha((int) (f * 255.0f));
    }

    public void setRootAlpha(int i7) {
        this.f855l = i7;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [o.e, o.j] */
    public n(n nVar) {
        this.f848c = new Matrix();
        this.f851h = 0.0f;
        this.f852i = 0.0f;
        this.f853j = 0.0f;
        this.f854k = 0.0f;
        this.f855l = 255;
        this.f856m = null;
        this.n = null;
        ?? jVar = new o.j(0);
        this.f857o = jVar;
        this.f850g = new k(nVar.f850g, jVar);
        this.f846a = new Path(nVar.f846a);
        this.f847b = new Path(nVar.f847b);
        this.f851h = nVar.f851h;
        this.f852i = nVar.f852i;
        this.f853j = nVar.f853j;
        this.f854k = nVar.f854k;
        this.f855l = nVar.f855l;
        this.f856m = nVar.f856m;
        String str = nVar.f856m;
        if (str != null) {
            jVar.put(str, this);
        }
        this.n = nVar.n;
    }
}
