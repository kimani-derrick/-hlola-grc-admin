package o1;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import androidx.databinding.DataBinderMapperImpl;
import androidx.fragment.app.DialogInterface$OnCancelListenerC0263q;
import androidx.lifecycle.Y;
import com.boxhdo.android.tv.R;
import com.boxhdo.android.tv.ui.activity.player.TvPlayerViewModel;
import com.boxhdo.domain.model.EpisodeSource;
import com.boxhdo.domain.model.StreamSource;
import com.boxhdo.domain.type.Quality;
import j1.AbstractC0809g;
import java.util.List;
import k3.AbstractC0958a;
import w4.l0;
import w5.InterfaceC1437b;
/* renamed from: o1.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1057b extends DialogInterface$OnCancelListenerC0263q implements InterfaceC1437b {

    /* renamed from: D0  reason: collision with root package name */
    public dagger.hilt.android.internal.managers.i f12837D0;

    /* renamed from: E0  reason: collision with root package name */
    public boolean f12838E0;

    /* renamed from: F0  reason: collision with root package name */
    public volatile dagger.hilt.android.internal.managers.g f12839F0;

    /* renamed from: I0  reason: collision with root package name */
    public AbstractC0809g f12841I0;
    public final Object G0 = new Object();

    /* renamed from: H0  reason: collision with root package name */
    public boolean f12840H0 = false;

    /* renamed from: J0  reason: collision with root package name */
    public final H.e f12842J0 = l0.k(this, M5.p.a(TvPlayerViewModel.class), new A1.i(7, this), new A1.i(8, this), new A1.i(9, this));

    @Override // androidx.fragment.app.ComponentCallbacksC0269x
    public final void E(Activity activity) {
        boolean z7;
        this.f6117U = true;
        dagger.hilt.android.internal.managers.i iVar = this.f12837D0;
        if (iVar != null && dagger.hilt.android.internal.managers.g.b(iVar) != activity) {
            z7 = false;
        } else {
            z7 = true;
        }
        android.support.v4.media.session.b.p(z7, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        l0();
        if (!this.f12840H0) {
            this.f12840H0 = true;
            ((InterfaceC1058c) k()).getClass();
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0263q, androidx.fragment.app.ComponentCallbacksC0269x
    public final void F(Context context) {
        super.F(context);
        l0();
        if (!this.f12840H0) {
            this.f12840H0 = true;
            ((InterfaceC1058c) k()).getClass();
        }
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0269x
    public final View H(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        StreamSource streamSource;
        int i7;
        int i8;
        int i9;
        int i10;
        M5.g.f(layoutInflater, "inflater");
        int i11 = AbstractC0809g.f11633y;
        DataBinderMapperImpl dataBinderMapperImpl = androidx.databinding.b.f5656a;
        AbstractC0809g abstractC0809g = (AbstractC0809g) androidx.databinding.d.K0(layoutInflater, R.layout.dialog_tv_select_quality, viewGroup, false, null);
        M5.g.e(abstractC0809g, "inflate(inflater, container, false)");
        this.f12841I0 = abstractC0809g;
        abstractC0809g.f11640x.setOnClickListener(new C1.b(6, this));
        EpisodeSource episodeSource = k0().f7810p;
        if (episodeSource != null) {
            streamSource = episodeSource.f7982w;
        } else {
            streamSource = null;
        }
        AbstractC0809g abstractC0809g2 = this.f12841I0;
        if (abstractC0809g2 != null) {
            if (streamSource != null) {
                RadioButton radioButton = abstractC0809g2.f11635s;
                M5.g.e(radioButton, "chipFHD");
                List list = streamSource.f8065q;
                int i12 = 8;
                if (!list.isEmpty()) {
                    i8 = 0;
                } else {
                    i8 = 8;
                }
                radioButton.setVisibility(i8);
                RadioButton radioButton2 = abstractC0809g2.f11637u;
                M5.g.e(radioButton2, "chipHD");
                List list2 = streamSource.f8066r;
                if (!list2.isEmpty()) {
                    i9 = 0;
                } else {
                    i9 = 8;
                }
                radioButton2.setVisibility(i9);
                RadioButton radioButton3 = abstractC0809g2.f11639w;
                M5.g.e(radioButton3, "chipSDP");
                List list3 = streamSource.f8068t;
                if (!list3.isEmpty()) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                radioButton3.setVisibility(i10);
                RadioButton radioButton4 = abstractC0809g2.f11638v;
                M5.g.e(radioButton4, "chipSD");
                List list4 = streamSource.f8067s;
                if (!list4.isEmpty()) {
                    i12 = 0;
                }
                radioButton4.setVisibility(i12);
                Quality quality = k0().f7812r;
                Quality quality2 = Quality.f8104q;
                if (quality != quality2) {
                    boolean z7 = !list.isEmpty();
                    quality2 = Quality.f8105r;
                    if (!z7 || quality != quality2) {
                        boolean z8 = !list2.isEmpty();
                        Quality quality3 = Quality.f8106s;
                        if (z8 && (quality == quality2 || quality == quality3)) {
                            j0(quality3);
                        } else {
                            boolean z9 = !list3.isEmpty();
                            Quality quality4 = Quality.f8107t;
                            if (z9 && (quality == quality2 || quality == quality3 || quality == quality4)) {
                                j0(quality4);
                            } else if (!list4.isEmpty()) {
                                Quality quality5 = Quality.f8108u;
                                if (quality == quality2 || quality == quality3 || quality == quality4 || quality == quality5) {
                                    j0(quality5);
                                }
                            }
                        }
                    }
                }
                j0(quality2);
            }
            int ordinal = k0().f7812r.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal != 3) {
                            if (ordinal == 4) {
                                i7 = R.id.chipSD;
                            } else {
                                throw new RuntimeException();
                            }
                        } else {
                            i7 = R.id.chipSDP;
                        }
                    } else {
                        i7 = R.id.chipHD;
                    }
                } else {
                    i7 = R.id.chipFHD;
                }
            } else {
                i7 = R.id.chipAuto;
            }
            RadioGroup radioGroup = abstractC0809g.f11636t;
            radioGroup.check(i7);
            radioGroup.setOnCheckedChangeListener(new C1056a(abstractC0809g, this, 0));
            AbstractC0809g abstractC0809g3 = this.f12841I0;
            if (abstractC0809g3 != null) {
                return abstractC0809g3.f5662g;
            }
            M5.g.l("binding");
            throw null;
        }
        M5.g.l("binding");
        throw null;
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0263q, androidx.fragment.app.ComponentCallbacksC0269x
    public final LayoutInflater L(Bundle bundle) {
        LayoutInflater L6 = super.L(bundle);
        return L6.cloneInContext(new dagger.hilt.android.internal.managers.i(L6, this));
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0269x
    public final void Q() {
        Window window;
        Window window2;
        this.f6117U = true;
        Dialog dialog = this.y0;
        if (dialog != null && (window2 = dialog.getWindow()) != null) {
            window2.setLayout(-1, -2);
        }
        Dialog dialog2 = this.y0;
        if (dialog2 != null && (window = dialog2.getWindow()) != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
    }

    public final void j0(Quality quality) {
        int i7;
        AbstractC0809g abstractC0809g = this.f12841I0;
        if (abstractC0809g != null) {
            int ordinal = quality.ordinal();
            RadioGroup radioGroup = abstractC0809g.f11636t;
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal != 3) {
                            if (ordinal == 4) {
                                i7 = R.id.chipSD;
                            } else {
                                return;
                            }
                        } else {
                            i7 = R.id.chipSDP;
                        }
                    } else {
                        i7 = R.id.chipHD;
                    }
                } else {
                    i7 = R.id.chipFHD;
                }
            } else {
                i7 = R.id.chipAuto;
            }
            radioGroup.check(i7);
            return;
        }
        M5.g.l("binding");
        throw null;
    }

    @Override // w5.InterfaceC1437b
    public final Object k() {
        if (this.f12839F0 == null) {
            synchronized (this.G0) {
                try {
                    if (this.f12839F0 == null) {
                        this.f12839F0 = new dagger.hilt.android.internal.managers.g(this);
                    }
                } finally {
                }
            }
        }
        return this.f12839F0.k();
    }

    public final TvPlayerViewModel k0() {
        return (TvPlayerViewModel) this.f12842J0.getValue();
    }

    public final void l0() {
        if (this.f12837D0 == null) {
            this.f12837D0 = new dagger.hilt.android.internal.managers.i(super.o(), this);
            this.f12838E0 = AbstractC0958a.v(super.o());
        }
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0269x
    public final Context o() {
        if (super.o() == null && !this.f12838E0) {
            return null;
        }
        l0();
        return this.f12837D0;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0269x, androidx.lifecycle.InterfaceC0332j
    public final Y r() {
        return android.support.v4.media.session.b.j0(this, super.r());
    }
}
