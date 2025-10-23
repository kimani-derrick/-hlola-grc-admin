package B3;

import K.O;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import java.lang.reflect.Field;
/* loaded from: classes.dex */
public final class j implements ViewGroup.OnHierarchyChangeListener {

    /* renamed from: q  reason: collision with root package name */
    public ViewGroup.OnHierarchyChangeListener f254q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ ChipGroup f255r;

    public j(ChipGroup chipGroup) {
        this.f255r = chipGroup;
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewAdded(View view, View view2) {
        ChipGroup chipGroup = this.f255r;
        if (view == chipGroup && (view2 instanceof Chip)) {
            if (view2.getId() == -1) {
                Field field = O.f1447a;
                view2.setId(View.generateViewId());
            }
            Chip chip = (Chip) view2;
            if (chip.isChecked()) {
                ((ChipGroup) view).b(chip.getId());
            }
            chip.setOnCheckedChangeListenerInternal(chipGroup.f8839y);
        }
        ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f254q;
        if (onHierarchyChangeListener != null) {
            onHierarchyChangeListener.onChildViewAdded(view, view2);
        }
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewRemoved(View view, View view2) {
        if (view == this.f255r && (view2 instanceof Chip)) {
            ((Chip) view2).setOnCheckedChangeListenerInternal(null);
        }
        ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f254q;
        if (onHierarchyChangeListener != null) {
            onHierarchyChangeListener.onChildViewRemoved(view, view2);
        }
    }
}
