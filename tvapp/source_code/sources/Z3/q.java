package Z3;

import com.google.crypto.tink.shaded.protobuf.AbstractC0530h;
import e4.X;
import e4.r0;
import g4.C0736a;
import java.security.GeneralSecurityException;
/* loaded from: classes.dex */
public final class q implements s {

    /* renamed from: a  reason: collision with root package name */
    public final String f4725a;

    /* renamed from: b  reason: collision with root package name */
    public final C0736a f4726b;

    /* renamed from: c  reason: collision with root package name */
    public final AbstractC0530h f4727c;
    public final X d;

    /* renamed from: e  reason: collision with root package name */
    public final r0 f4728e;
    public final Integer f;

    public q(String str, AbstractC0530h abstractC0530h, X x7, r0 r0Var, Integer num) {
        this.f4725a = str;
        this.f4726b = w.b(str);
        this.f4727c = abstractC0530h;
        this.d = x7;
        this.f4728e = r0Var;
        this.f = num;
    }

    public static q a(String str, AbstractC0530h abstractC0530h, X x7, r0 r0Var, Integer num) {
        if (r0Var == r0.f10139u) {
            if (num != null) {
                throw new GeneralSecurityException("Keys with output prefix type raw should not have an id requirement.");
            }
        } else if (num == null) {
            throw new GeneralSecurityException("Keys with output prefix type different from raw should have an id requirement.");
        }
        return new q(str, abstractC0530h, x7, r0Var, num);
    }
}
