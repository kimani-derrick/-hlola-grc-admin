package H0;
/* loaded from: classes.dex */
public abstract class m extends l {

    /* renamed from: a  reason: collision with root package name */
    public D.g[] f842a;

    /* renamed from: b  reason: collision with root package name */
    public String f843b;

    /* renamed from: c  reason: collision with root package name */
    public int f844c;
    public final int d;

    public m() {
        this.f842a = null;
        this.f844c = 0;
    }

    public D.g[] getPathData() {
        return this.f842a;
    }

    public String getPathName() {
        return this.f843b;
    }

    public void setPathData(D.g[] gVarArr) {
        if (!android.support.v4.media.session.b.d(this.f842a, gVarArr)) {
            this.f842a = android.support.v4.media.session.b.f0(gVarArr);
            return;
        }
        D.g[] gVarArr2 = this.f842a;
        for (int i7 = 0; i7 < gVarArr.length; i7++) {
            gVarArr2[i7].f433a = gVarArr[i7].f433a;
            int i8 = 0;
            while (true) {
                float[] fArr = gVarArr[i7].f434b;
                if (i8 < fArr.length) {
                    gVarArr2[i7].f434b[i8] = fArr[i8];
                    i8++;
                }
            }
        }
    }

    public m(m mVar) {
        this.f842a = null;
        this.f844c = 0;
        this.f843b = mVar.f843b;
        this.d = mVar.d;
        this.f842a = android.support.v4.media.session.b.f0(mVar.f842a);
    }
}
