package n1;

import W5.InterfaceC0116x;
import com.boxhdo.android.tv.ui.activity.main.TVViewModel;
import com.boxhdo.domain.model.ContactInfo;
import k3.AbstractC0958a;
import z5.C1530l;
/* renamed from: n1.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1027b extends F5.i implements L5.p {

    /* renamed from: u  reason: collision with root package name */
    public TVViewModel f12620u;

    /* renamed from: v  reason: collision with root package name */
    public int f12621v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ TVViewModel f12622w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1027b(TVViewModel tVViewModel, D5.d dVar) {
        super(2, dVar);
        this.f12622w = tVViewModel;
    }

    @Override // F5.a
    public final D5.d h(D5.d dVar, Object obj) {
        return new C1027b(this.f12622w, dVar);
    }

    @Override // L5.p
    public final Object j(Object obj, Object obj2) {
        return ((C1027b) h((D5.d) obj2, (InterfaceC0116x) obj)).p(C1530l.f16479a);
    }

    @Override // F5.a
    public final Object p(Object obj) {
        TVViewModel tVViewModel;
        String str;
        E5.a aVar = E5.a.f612q;
        int i7 = this.f12621v;
        if (i7 != 0) {
            if (i7 == 1) {
                tVViewModel = this.f12620u;
                AbstractC0958a.H(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0958a.H(obj);
            TVViewModel tVViewModel2 = this.f12622w;
            T4.c cVar = tVViewModel2.f7785j;
            this.f12620u = tVViewModel2;
            this.f12621v = 1;
            Object O5 = cVar.O(this);
            if (O5 == aVar) {
                return aVar;
            }
            tVViewModel = tVViewModel2;
            obj = O5;
        }
        ContactInfo contactInfo = (ContactInfo) obj;
        if (contactInfo != null) {
            str = contactInfo.f7945c;
        } else {
            str = null;
        }
        if (str == null) {
            str = "";
        }
        tVViewModel.f7787l = str;
        return C1530l.f16479a;
    }
}
