package X2;

import android.content.Context;
import android.webkit.WebView;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
/* loaded from: classes.dex */
public final class M extends FrameLayout implements G {

    /* renamed from: q  reason: collision with root package name */
    public final C0121c f4149q;

    /* renamed from: r  reason: collision with root package name */
    public final K f4150r;

    /* renamed from: s  reason: collision with root package name */
    public List f4151s;

    /* renamed from: t  reason: collision with root package name */
    public C0122d f4152t;

    /* renamed from: u  reason: collision with root package name */
    public float f4153u;

    /* renamed from: v  reason: collision with root package name */
    public int f4154v;

    /* renamed from: w  reason: collision with root package name */
    public float f4155w;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.view.View, android.webkit.WebView, X2.K] */
    public M(Context context) {
        super(context, null);
        this.f4151s = Collections.emptyList();
        this.f4152t = C0122d.f4165g;
        this.f4153u = 0.0533f;
        this.f4154v = 0;
        this.f4155w = 0.08f;
        C0121c c0121c = new C0121c(context);
        this.f4149q = c0121c;
        ?? webView = new WebView(context, null);
        this.f4150r = webView;
        webView.setBackgroundColor(0);
        addView(c0121c);
        addView(webView);
    }

    @Override // X2.G
    public final void a(List list, C0122d c0122d, float f, int i7, float f7) {
        this.f4152t = c0122d;
        this.f4153u = f;
        this.f4154v = i7;
        this.f4155w = f7;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i8 = 0; i8 < list.size(); i8++) {
            M2.b bVar = (M2.b) list.get(i8);
            if (bVar.f2246t != null) {
                arrayList.add(bVar);
            } else {
                arrayList2.add(bVar);
            }
        }
        if (!this.f4151s.isEmpty() || !arrayList2.isEmpty()) {
            this.f4151s = arrayList2;
            c();
        }
        this.f4149q.a(arrayList, c0122d, f, i7, f7);
        invalidate();
    }

    public final String b(int i7, float f) {
        float F = m3.g.F(f, i7, getHeight(), (getHeight() - getPaddingTop()) - getPaddingBottom());
        if (F == -3.4028235E38f) {
            return "unset";
        }
        Object[] objArr = {Float.valueOf(F / getContext().getResources().getDisplayMetrics().density)};
        int i8 = Z2.H.f4603a;
        return String.format(Locale.US, "%.2fpx", objArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:83:0x01fe, code lost:
        if (r3 != 0) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0201, code lost:
        r26 = "left";
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0204, code lost:
        if (r3 != 0) goto L256;
     */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0455  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x046d  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0479  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x047c  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x05e5  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0621  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0643  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0691  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x06c7  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0253  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c() {
        /*
            Method dump skipped, instructions count: 1859
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X2.M.c():void");
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z7, int i7, int i8, int i9, int i10) {
        super.onLayout(z7, i7, i8, i9, i10);
        if (z7 && !this.f4151s.isEmpty()) {
            c();
        }
    }
}
