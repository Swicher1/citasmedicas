package com.hospital.citasmedicas.service;



/*public class PacienteServiceTest {

    @Mock
    private PacienteRepository pacienteRepository;

    @InjectMocks
    private PacienteService pacienteService;

    private Paciente paciente;

    @BeforeEach
    void setUp() {
        paciente = new Paciente(null, "Juan Pérez", "12345678", LocalDate.of(1990, 5, 10), "987654321", null);
    }

    @Test
    void debeRegistrarPaciente() {
        when(pacienteRepository.save(any(Paciente.class))).thenReturn(paciente);

        Paciente registrado = pacienteService.registrarPaciente(paciente);

        assertNotNull(registrado);
        assertEquals("Juan Pérez", registrado.getNombres());
        verify(pacienteRepository, times(1)).save(paciente);
    }

    @Test
    void debeListarPacientes() {
        when(pacienteRepository.findAll()).thenReturn(List.of(paciente));

        List<Paciente> pacientes = pacienteService.obtenerTodos();

        assertEquals(1, pacientes.size());
        verify(pacienteRepository, times(1)).findAll();
    }

    @Test
    void noDebeRegistrarPacienteSinDni() {
        paciente.setDni(null);

        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            pacienteService.registrarPaciente(paciente);
        });

        assertEquals("El DNI es obligatorio", exception.getMessage());
        verify(pacienteRepository, never()).save(any());
    }
}*/

