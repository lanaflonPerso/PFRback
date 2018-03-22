package co.simplon.pfr.FredDemoPrf.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.pfr.FredDemoPrf.model.FredCase;
import co.simplon.pfr.FredDemoPrf.repository.FredCaseRepository;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class FredCaseController {
	
	@Autowired
	FredCaseRepository fredCaseRepository;
	
    // Consulter toutes les FredCase
	// "SELECT * FROM fred_case"
    @GetMapping("/case")
    public List<FredCase> getAllPoliceCase() {
        return fredCaseRepository.findAll();
    }

//    Créer une nouvelle FredCase
//    @Override
//    public void createFredCase (String name, Stringdescription) throws Exception {
//        String sql = "INSERT INTO fred_case (name, description) VALUES (name = ?, description = ?);
//        try (Connection connection = this.datasource.getConnection()) {
//            try (PreparedStatement pstmt = connection.prepareStatement(sql)) {
//                try {
//                    pstmt.setString (1, name);
//                    pstmt.setObject (2, description, Types.VARCHAR);
//                    logSQL(pstmt);
//                    int result = pstmt.executeUpdate();
//                    if (result != 1) {
//                        throw new Exception("id not found !");
//                    }
//                } catch (SQLException e) {
//                    LoggerFactory.getLogger("SQL Error !:" + pstmt.toString() + e);
//                    throw e;
//                }            }        }    }

    @PostMapping("/case")
    public FredCase createFredCase(@Valid @RequestBody FredCase fredCase) {
        return fredCaseRepository.save ( fredCase );
    }

    // Consulter une seule FredCase
    // exemple : "SELECT * FROM fred_case WHERE id = 1;"
    @GetMapping("/case/{id}")
    public ResponseEntity<FredCase> getFredCaseById(@PathVariable(value = "id") Long fredCaseId) {
        FredCase fredCase = fredCaseRepository.findOne (fredCaseId);
        if(fredCase == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok().body(fredCase);
    }

    // Mise à jour d'une FredCase
    // exemple : "UPDATE fred_case SET name ="new name" WHERE id = 1;
    @PutMapping("/case/{id}")
    public ResponseEntity<FredCase> updateFredCase(@PathVariable(value = "id") Long fredCaseId,
                                                  @Valid @RequestBody FredCase fredCaseValue) {
        FredCase fredCase = fredCaseRepository.findOne(fredCaseId);
        if(fredCase == null) {
            return ResponseEntity.notFound().build();
        }
        fredCase.setName (fredCaseValue.getName ());
        fredCase.setDescription (fredCaseValue.getDescription ());

        FredCase updatedFredCase = fredCaseRepository.save(fredCase);
        return ResponseEntity.ok(updatedFredCase);
    }


    // Efface une FredCase
    // "DELETE FROM fred_case WHERE id = 1;"
    @DeleteMapping("/case/{id}")
    public ResponseEntity<FredCase> deleteFredCase(@PathVariable(value = "id") Long fredCaseId) {
        FredCase fredCase = fredCaseRepository.findOne(fredCaseId);
        if(fredCase == null) {
            return ResponseEntity.notFound().build();
        }

        fredCaseRepository.delete(fredCase);
        return ResponseEntity.ok().build();
    }
}
	
