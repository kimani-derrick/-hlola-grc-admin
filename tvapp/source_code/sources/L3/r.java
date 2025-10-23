package L3;

import android.content.Context;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
/* loaded from: classes.dex */
public abstract class r {

    /* renamed from: a  reason: collision with root package name */
    public final TextInputLayout f2096a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f2097b;

    /* renamed from: c  reason: collision with root package name */
    public final CheckableImageButton f2098c;

    public r(TextInputLayout textInputLayout) {
        this.f2096a = textInputLayout;
        this.f2097b = textInputLayout.getContext();
        this.f2098c = textInputLayout.getEndIconView();
    }

    public abstract void a();

    public boolean b(int i7) {
        return true;
    }

    public void c(boolean z7) {
    }
}
