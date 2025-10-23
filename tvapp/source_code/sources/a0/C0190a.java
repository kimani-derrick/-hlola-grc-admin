package a0;

import android.text.Editable;
import androidx.emoji2.text.s;
/* renamed from: a0.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0190a extends Editable.Factory {

    /* renamed from: a  reason: collision with root package name */
    public static final Object f4959a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static volatile C0190a f4960b;

    /* renamed from: c  reason: collision with root package name */
    public static Class f4961c;

    @Override // android.text.Editable.Factory
    public final Editable newEditable(CharSequence charSequence) {
        Class cls = f4961c;
        if (cls != null) {
            return new s(cls, charSequence);
        }
        return super.newEditable(charSequence);
    }
}
