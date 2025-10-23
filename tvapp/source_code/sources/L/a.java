package L;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;
/* loaded from: classes.dex */
public final class a extends ClickableSpan {

    /* renamed from: a  reason: collision with root package name */
    public final int f1837a;

    /* renamed from: b  reason: collision with root package name */
    public final i f1838b;

    /* renamed from: c  reason: collision with root package name */
    public final int f1839c;

    public a(int i7, i iVar, int i8) {
        this.f1837a = i7;
        this.f1838b = iVar;
        this.f1839c = i8;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f1837a);
        this.f1838b.f1854a.performAction(this.f1839c, bundle);
    }
}
